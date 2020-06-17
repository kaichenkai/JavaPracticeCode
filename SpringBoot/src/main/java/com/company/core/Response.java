package com.company.core;

import com.alibaba.fastjson.JSON;

import java.util.function.Consumer;

/**
 * @author: kaichenkai
 * @create: 6/16/2020 18:03
 */
public class Response<T> {
    private int code;
    private String message;
    private T data;

    // getters, setters, toString(), etc.

    public int getCode() {
        return code;
    }

    public Response setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Response setMessage(String message) {
        this.message = message;
        return this;
    }

//    public Response setCodeAndMessage(int code, String message) {
//        this.code = code;
//        if (message == null) {
//            this.message = "success";
//        } else {
//            this.message = message;
//        }
//        return this;
//    }
//
//    public Response setCodeAndMessage(ExceptionInfo exceptionInfo) {
//        this.code = exceptionInfo.code;
//        this.message = exceptionInfo.message;
//        return this;
//    }

    public T getData() {
        return data;
    }

    public Response setData(T data) {
        this.data = data;
        return this;
    }

//    public boolean success() {
//        return code == SUCCESS_CODE;
//    }
//
//    public boolean failed() {
//        return code == FAIL_CODE;
//    }

//    public void onFail(Consumer<String> consumer) {
//        if (!success()) {
//            consumer.accept(this.message);
//        }
//    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
