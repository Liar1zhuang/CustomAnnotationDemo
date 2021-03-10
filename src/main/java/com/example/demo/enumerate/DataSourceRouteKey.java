package com.example.demo.enumerate;

/**
 * @描述:读写操作枚举类
 * @Author:zhuangxinan
 * @Date:2021/2/2 11:42
 */
public enum DataSourceRouteKey {
    READONLY("readonly"),
    READWRITE("readwrite");

    private String key;

    DataSourceRouteKey(String key){
        this.key = key;
    }
    public String getKey(){
        return key;
    }
}
