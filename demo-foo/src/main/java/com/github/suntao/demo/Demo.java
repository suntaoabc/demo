/**
 * foo
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author suntao
 * @date 2018-10-09 14:19
 */
public class Demo {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Demo.class);
        logger.info("test");
        int a = 30;

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -a);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(Objects.equals(1, new Integer(1)));


        System.out.println(new StringBuilder().toString());
    }
}