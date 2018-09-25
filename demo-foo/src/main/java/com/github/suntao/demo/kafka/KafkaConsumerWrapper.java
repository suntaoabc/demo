/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.kafka;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * 不支持多次启动.
 *
 * @author suntao
 * @date 2018-09-25 16:57
 */
@Component
public class KafkaConsumerWrapper implements SmartLifecycle {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerWrapper.class);

    private final KafkaConsumer<String, Long> kafkaConsumer;

    private final AtomicBoolean isRunning = new AtomicBoolean(false);

    private final Thread consumerThread;

    private final CountDownLatch countDownLatch = new CountDownLatch(1);

    public KafkaConsumerWrapper() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.6.117:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "demo");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.LongDeserializer.class);
        kafkaConsumer = new KafkaConsumer<>(props);
        consumerThread = new Thread(new Runner(), "consumer thread");
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        this.stop();
        callback.run();
    }

    @Override
    public void start() {
        if (!isRunning.compareAndSet(false, true)) {
            return;
        }
        consumerThread.start();
    }

    @Override
    public void stop() {

        if (isRunning.compareAndSet(true, false)) {

            consumerThread.interrupt();
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                // ignore
            }

        }
    }

    @Override
    public boolean isRunning() {
        return isRunning.get();
    }

    @Override
    public int getPhase() {
        return 0;
    }

    private class Runner implements Runnable {

        @Override
        public void run() {

            kafkaConsumer.subscribe(Arrays.asList("streams-wordcount-output"));

            while (isRunning.get()) {
                try {
                    ConsumerRecords<String, Long> records = kafkaConsumer.poll(Duration.ofMillis(100L));
                    if (records.isEmpty()) {
                        continue;
                    }

                    records.iterator().forEachRemaining(record -> LOGGER.info("receive message: {}->{}", record.key(), record.value()));
                } catch (WakeupException e) {
                    // ignore
                } catch (Exception e) {
                    break;
                }

            }

            kafkaConsumer.close();
            countDownLatch.countDown();
        }
    }
}