package com.example.demo.annotation;

import com.example.demo.enumerate.DataSourceRouteKey;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @描述:读写权限转换注解
 * @Author:zhuangxinan
 * @Date:2021/2/2 11:48
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RWSwitch {
    DataSourceRouteKey source() default DataSourceRouteKey.READWRITE;
}
