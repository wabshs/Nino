package com.nino.ninobackend.exception;


import com.nino.ninobackend.exception.exceptionenum.TestExceptionCodeMsg;
import lombok.Getter;

@Getter
public class TestException extends RuntimeException{
    private int code = 500;
    private String msg = "服务器异常";

    public TestException(TestExceptionCodeMsg testExceptionCodeMsg){
        super();
        this.code = testExceptionCodeMsg.getCode();
        this.msg = testExceptionCodeMsg.getMsg();

    }

    public TestException(int code,String msg){
        super();
        this.code = code;
        this.msg = msg;

    }
}
