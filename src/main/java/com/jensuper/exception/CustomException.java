package com.jensuper.exception;

import lombok.Getter;

/**
 * @author jichao
 * @version V1.0
 * @description:
 * @date 2020/04/08
 */
@Getter
public class CustomException extends RuntimeException {

    private Integer code;
    private String msg;

    public CustomException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
