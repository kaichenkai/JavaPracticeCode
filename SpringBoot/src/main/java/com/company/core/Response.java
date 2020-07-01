package com.company.core;

import com.alibaba.fastjson.JSON;

import java.util.function.Consumer;

/**
 * @author: kaichenkai
 * @create: 6/16/2020 18:03
 */
public class Response<T> {
    public static final int SUCCESS_CODE = 0;
    public static final int UNAUTHORIZED = 403;//未认证（签名错误）
    public static final int NOT_FOUND = 404;//接口不存在
    public static final int USER_UNABLE = 409;//用户账号不可用，需修改密码
    
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
