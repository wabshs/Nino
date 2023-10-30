package com.nino.ninobackend.common;

import com.nino.ninobackend.exception.TestException;

public class Resp<T> {

    //success code
    private int code = 200;

    //success message
    private String msg = "success";

    //server data
    private T data;

    private Resp(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Resp success(T data) {
        Resp resp = new Resp(200, "success", data);
        return resp;
    }

    public static <T> Resp success(String msg, T data) {
        Resp resp = new Resp(200, msg, data);
        return resp;
    }

    public static <T> Resp error(TestException testException) {
        Resp resp = new Resp(testException.getCode(), testException.getMsg(), null);
        return resp;
    }

    public static <T> Resp error(int code, String msg) {
        Resp resp = new Resp(code, msg, null);
        return resp;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
