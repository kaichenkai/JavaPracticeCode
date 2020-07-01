package com.company.core;

import com.alibaba.fastjson.JSONObject;

/**
 * 响应结果生成工具
 */
public class ResponseGenerator {
    public static final String DEFAULT_SUCCESS_MESSAGE = "success";
    public static final String CODE = "code";
    public static final String MESSAGE = "message";

    public static Response genSuccessResp() {
        return new Response().setCode(Response.SUCCESS_CODE).setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Response<T> genSuccessResp(T data) {
        return new Response()
                .setCode(Response.SUCCESS_CODE)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Response genErrorResp(ExceptionInfo exceptionInfo) {
        return new Response()
                .setCode(exceptionInfo.code)
                .setMessage(exceptionInfo.message);
    }

    public static <T> Response<T> genResp(int code, String message, T data) {
        return new Response()
                .setCode(code)
                .setMessage(message)
                .setData(data);
    }

    public static Response genResp(int code, String message) {
        return new Response()
                .setCode(code)
                .setMessage(message);
    }

    public static Response parseJson(JSONObject response) {
        return new Response()
                .setCode(response.getIntValue(response.getString(CODE)))
                .setMessage(response.getString(MESSAGE));
    }
}
