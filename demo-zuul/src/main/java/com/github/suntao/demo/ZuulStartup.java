
package com.github.suntao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *
 * @author suntao
 * @date 2018-09-21 15:17
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulStartup {
    public static void main(String[] args) {
        SpringApplication.run(ZuulStartup.class, args);
    }
}
