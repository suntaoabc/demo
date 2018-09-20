/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntaoabc.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author suntao
 * @date 2018-09-19 14:53
 */
@RestController
public class HelloWorldController {


    @GetMapping(path = "/home", produces = "application/json")
    public String home() {
        return "{\"rspCode\": 0}";
    }
}