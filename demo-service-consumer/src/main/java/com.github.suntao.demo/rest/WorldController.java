/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.suntao.demo.remote.HelloService;

import java.util.Map;

/**
 *
 * @author suntao
 * @date 2018-09-20 20:20
 */
@RestController
public class WorldController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return helloService.hello();
    }
}