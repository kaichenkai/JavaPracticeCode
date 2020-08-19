package com.company.core;


import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 15:52
 * 全局捕获服务异常
 */
@ControllerAdvice//切面
public class GlobalExceptionHandler {
    //捕获运行时异常
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Response exceptionHandler(){
        return ResponseGenerator.genErrorResp(ExceptionInfo.INTERNAL_SERVER_ERROR);
    }

    //无论发送什么异常，http的状态码必须返回200，由业务码去区分系统的异常情况
    //解决@RequestBody标注的参数的验证及错误处理
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Response handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        StringBuilder errorData = new StringBuilder();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            errorData.append(fieldError.getDefaultMessage()).append(" | ");
        }
        //去掉末尾的 " | "
        errorData.delete(errorData.length() - 3, errorData.length());
        String data = errorData.toString();
        return ResponseGenerator.genErrorResp(ExceptionInfo.INVALID_PARAMS, data);
    }

    //处理@PathVariable以及@RequestParam标注的入参
    @ExceptionHandler({ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Response handleConstraintViolationException(ConstraintViolationException ex) {
        List<String> errorContentList = ex.getConstraintViolations()
                .stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.toList());
        //拼接响应内容
        StringBuilder errorData = new StringBuilder();
        for (String errorContent : errorContentList) {
            errorData.append(errorContent).append(" | ");
        }
        //去掉末尾的 " | "
        errorData.delete(errorData.length() - 3, errorData.length());
        String data = errorData.toString();
        return ResponseGenerator.genErrorResp(ExceptionInfo.INVALID_PARAMS, data);
    }
}
