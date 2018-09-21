/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.rest;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 *
 * @author suntao
 * @date 2018-09-20 19:04
 */
@RestController
public class DemoController {

    @Value("${helloMessage}")
    private String provider;

    @RequestMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> map = Maps.newHashMapWithExpectedSize(1);
        map.put("provider", provider);
        return map;
    }
}