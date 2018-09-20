/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.remote;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author suntao
 * @date 2018-09-20 19:59
 */
@FeignClient("hello")
public interface HelloService {
    @RequestMapping("/hello")
    Map<String, String> hello();
}
