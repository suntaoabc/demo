/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import com.github.suntao.demo.remote.HelloService;

/**
 *
 * @author suntao
 * @date 2018-09-20 19:48
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "org.crazyit.client")
public class ConsumerStartup {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(ConsumerStartup.class)
            .web(false).run(args);
        HelloService helloService = ctx.getBean("hello", HelloService.class);
        System.out.println("========================" + helloService.hello());

    }
}