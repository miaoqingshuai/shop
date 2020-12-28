package com.mr.advice;

//异常拦截类  拦截 controller 抛出的异常

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    // 拦截指定异常
    @ExceptionHandler(MrException.class) // 如果发生指定异常,就走这个方法
    public ResponseEntity<ExceptionResoult> handlerException(MrException e){
       System.out.println("拦截到运行时异常"+e.getMessage());
       // 状态码不可写死 应该自行改变
        // 由于RuntimeException 不能写状态码
        // 需要一个自定义异常

        // 通过枚举取值

        return ResponseEntity.status(e.getExceptionEnums().getCode()).body( new ExceptionResoult(e.getExceptionEnums().getCode(),e.getExceptionEnums().getMessage()));
    }
}
