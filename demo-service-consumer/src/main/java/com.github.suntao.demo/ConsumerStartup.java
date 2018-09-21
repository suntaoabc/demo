/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @author suntao
 * @date 2018-09-20 19:48
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerStartup {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerStartup.class, args);

    }
}