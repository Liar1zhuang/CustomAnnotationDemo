package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:项目初始化测试
 * @Author:zhuangxinan
 * @Date:2021/2/1 11:49
 */
@RestController
public class Hello {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
