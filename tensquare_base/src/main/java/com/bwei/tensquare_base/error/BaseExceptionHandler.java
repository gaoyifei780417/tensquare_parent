package com.bwei.tensquare_base.error;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @User feifei
 * @ClassName BaseExceptionHandler  类名
 * @Author Administrator  作者
 * @Date 2020-05-08 22:39  时间
 * @Version 1.0 版本
 */
@ControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return new Result(true, StatusCode.ERROR,"系统异常,请联系管理员");
    }
}
