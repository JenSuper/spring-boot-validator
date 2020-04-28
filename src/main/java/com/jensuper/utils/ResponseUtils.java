package com.jensuper.utils;

import com.jensuper.vo.ResponseVo;

/**
 * @author jichao
 * @version V1.0
 * @description:
 * @date 2020/03/30
 */
public class ResponseUtils<T> {


    public static <T>ResponseVo<T> success() {
        ResponseVo<T> ret = new ResponseVo<>();
        ret.setCode(200);
        ret.setData(null);
        ret.setMsg("success");
        return ret;
    }

    public static <T>ResponseVo success(T data) {
        ResponseVo<T> ret = new ResponseVo<>();
        ret.setCode(200);
        ret.setData(data);
        ret.setMsg("success");
        return ret;
    }


    public static <T>ResponseVo<T> error() {
        ResponseVo<T> ret = new ResponseVo<>();
        ret.setCode(-1);
        ret.setData(null);
        ret.setMsg("error");
        return ret;
    }

    public static <T>ResponseVo error(T data) {
        ResponseVo<T> ret = new ResponseVo<>();
        ret.setCode(-1);
        ret.setData(data);
        ret.setMsg("error");
        return ret;
    }

    public static <T>ResponseVo error(T data,int code,String msg) {
        ResponseVo<T> ret = new ResponseVo<>();
        ret.setCode(code);
        ret.setData(data);
        ret.setMsg(msg);
        return ret;
    }
}
