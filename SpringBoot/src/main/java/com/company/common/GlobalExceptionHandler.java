package com.company.common;

import com.company.core.ExceptionInfo;
import com.company.core.Response;
import com.company.core.ResponseGenerator;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author: kaichenkai
 * @create: 7/1/2020 15:52
 * 全局捕获异常
 */
//@ControllerAdvice//切面
//public class GlobalExceptionHandler {
//    @ExceptionHandler(RuntimeException.class)//捕获运行时异常
//    @ResponseBody
//    public Response exceptionHandler(){
//        return ResponseGenerator.genErrorResp(ExceptionInfo.INTERNAL_SERVER_ERROR);
//    }
//}
