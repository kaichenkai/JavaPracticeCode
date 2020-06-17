package com.company.core;

import com.alibaba.fastjson.JSONObject;

/**
 * 响应结果生成工具
 */
public class ResponseGenerator {
    private static final int SUCCESS_CODE = 0;
    private static final int None = -1;//未知
    private static final int NODATA = 3;//无数据
    private static final int UNAUTHORIZED = 403;//未认证（签名错误）
    private static final int NOT_FOUND = 404;//接口不存在
    private static final int USER_UNABLE = 409;//用户账号不可用，需修改密码
    private static final int INTERNAL_SERVER_ERROR = 500;//服务器内部错误
    //
    private static final String DEFAULT_SUCCESS_MESSAGE = "success";
    private static final String DEFAULT_NODATA_MESSAGE = "no data";
    private static final String CODE = "code";
    private static final String MESSAGE = "message";

    public static Response genSuccessResp() {
        return new Response().setCode(SUCCESS_CODE).setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Response<T> genSuccessResp(T data) {
        return new Response()
                .setCode(SUCCESS_CODE)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Response genFailResp(ExceptionInfo exceptionInfo) {
        return new Response()
                .setCode(exceptionInfo.code)
                .setMessage(exceptionInfo.message);
    }

    public static Response genNoNataResp() {
        return new Response()
                .setCode(NODATA)
                .setMessage(DEFAULT_NODATA_MESSAGE);
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
