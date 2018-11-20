/**
 * foo
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.rest.response;

/**
 * @author suntao
 * @date 2018-11-06 19:09
 */
public enum ResultCode {

    SUCCESS(0, "success"), FAIL(-1, "fail");
    private int result;
    private String message;

    ResultCode(int result, String message) {
        this.result = result;
        this.message = message;
    }

    int getResult() {
        return this.result;
    }

    String getMessage() {
        return this.message;
    }
}