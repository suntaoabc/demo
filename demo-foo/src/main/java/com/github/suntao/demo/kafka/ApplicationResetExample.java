/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;

import java.util.Properties;

/**
 * @author suntao
 * @date 2018-09-28 19:03
 */
public class ApplicationResetExample {
    public static void main(String[] args) {
        final String bootstrapServers = args.length > 0 ? args[0] : "192.168.6.117:9092";
        final Properties streamsConfiguration = new Properties();
        streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, "application-reset-demo");
        streamsConfiguration.put(StreamsConfig.CLIENT_ID_CONFIG, "application-reset-demo-client");
        streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        streamsConfiguration.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        streamsConfiguration.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        streamsConfiguration.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        final KafkaStreams streams = run(args, streamsConfiguration);


        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }

    private static KafkaStreams run(String[] args, Properties streamsConfiguration) {
        final StreamsBuilder builder = new StreamsBuilder();
        final KStream<String, String> input = builder.stream("my-input-topic");
        input.selectKey((key, value) -> value.split(" ")[0]).groupByKey().count().toStream().to("my-output-topic", Produced.with(Serdes.String(), Serdes.Long()));
        final KafkaStreams streams = new KafkaStreams(builder.build(), streamsConfiguration);
        if (args.length > 0 && args[0].equals("--reset")) {
            streams.cleanUp();
        }
        streams.start();
        return streams;
    }
}