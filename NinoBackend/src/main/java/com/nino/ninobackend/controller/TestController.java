package com.nino.ninobackend.controller;


import ch.qos.logback.classic.spi.STEUtil;
import com.nino.ninobackend.common.Resp;
import com.nino.ninobackend.exception.TestException;
import com.nino.ninobackend.exception.exceptionenum.TestExceptionCodeMsg;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/demo")
    public Resp<String> test1(String name) {
        if ("ok".equals(name)) {
            return Resp.success("上传成功", null);
        }
        if ("err".equals(name)) {
            throw new TestException(TestExceptionCodeMsg.ERROR_CODE);
        }
        if ("0".equals(name)) {
            int i = 1 / 0;
        }
        return Resp.success("default");
    }


    @GetMapping("/list")
    public Resp<List> list() {
        List<String> list = Arrays.asList("张山", "lisi", "ww");
        return Resp.success(list);
    }
}
