package com.example.demo.controller;

import com.example.demo.enumerate.DataSourceRouteKey;
import com.example.demo.annotation.RWSwitch;
import com.example.demo.dataDource.DynamicDataSourceHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:注解测试控制器
 * @Author:zhuangxinan
 * @Date:2021/2/2 12:11
 */
@RestController
public class AnnotationTestController {
    @RWSwitch(source = DataSourceRouteKey.READONLY)
    @RequestMapping("/read")
    public String test01(){
        System.out.println("test01 使用的数据源为： " + DynamicDataSourceHolder.getRouteKey());
        return "";
    }

    @RWSwitch
    @RequestMapping("/write")
    public String test02(){
        System.out.println("test02 使用的数据源为： " + DynamicDataSourceHolder.getRouteKey());
        return "";
    }

    @RWSwitch(source = DataSourceRouteKey.READWRITE)
    @RequestMapping("/readWrite")
    public String test03(){
        System.out.println("test03 使用的数据源为： " + DynamicDataSourceHolder.getRouteKey());
        return "";
    }
}
