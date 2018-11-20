/**
 * foo
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author suntao
 * @date 2018-09-25 9:40
 */
@SpringBootApplication(scanBasePackages = "com.github.suntao.demo")
public class Application {
    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);

        System.out.println(maskIdNumber("321324199111"));
    }


    private static String maskIdNumber(String idNumber) {

        StringBuilder sb = new StringBuilder(idNumber.length());
        for (int i = 0; i < idNumber.length(); i++) {
            if (i >= 6 && i <= 13) {
                sb.append('*');
            } else {
                sb.append(idNumber.charAt(i));
            }
        }

        return sb.toString();
    }
}