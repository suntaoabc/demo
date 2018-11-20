/**
 * foo
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author suntao
 * @date 2018-09-20 19:08
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderStartup {
    public static void main(String[] args) {
        SpringApplication.run(ProviderStartup.class, args);
    }
}