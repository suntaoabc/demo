/**
 * foo
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.rest.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author suntao
 * @date 2018-11-06 19:08
 */

@Setter
@Getter
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 8185049296594338625L;
    private int result;
    private String errorMsg;
    private T data;

    public Response(ResultCode resultCode, T data) {
        this.result = resultCode.getResult();
        this.errorMsg = resultCode.getMessage();
        this.data = data;
    }
}
