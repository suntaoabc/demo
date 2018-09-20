/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author suntao
 * @date 2018-09-20 18:43
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStartup {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStartup.class, args);
    }
}