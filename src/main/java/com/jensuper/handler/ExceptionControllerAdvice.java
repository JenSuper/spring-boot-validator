package com.jensuper.handler;

import com.jensuper.exception.CustomException;
import com.jensuper.utils.ResponseUtils;
import com.jensuper.vo.ResponseVo;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author jichao
 * @version V1.0
 * @description: 全局异常捕获
 * @date 2020/04/08
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    /**
     * 捕获参数异常
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseVo methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        return ResponseUtils.error(message);
    }

    /**
     * 捕获自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public ResponseVo customException(CustomException e) {
        return ResponseUtils.error(null,e.getCode(),e.getMsg());
    }
}
