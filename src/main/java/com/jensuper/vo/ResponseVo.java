package com.jensuper.vo;

import lombok.Data;

/**
 * @author jichao
 * @version V1.0
 * @description:
 * @date 2020/03/30
 */
@Data
public class ResponseVo<T> {

    private Integer code;
    private T data;
    private String msg;

    public ResponseVo() {
    }

    public ResponseVo(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
}
