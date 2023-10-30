package com.nino.ninobackend.exception.exceptionenum;

import lombok.Getter;

@Getter
public enum TestExceptionCodeMsg {

    ERROR_CODE(500, "失败");

    private int code;
    private String msg;


    TestExceptionCodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
