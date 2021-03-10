package com.example.demo.dataDource;

import com.example.demo.enumerate.DataSourceRouteKey;

/**
 * @描述:动态数据源holder
 * @Author:zhuangxinan
 * @Date:2021/2/2 11:59
 */
public class DynamicDataSourceHolder {
    private static ThreadLocal<DataSourceRouteKey> routeKey = new ThreadLocal<DataSourceRouteKey>();

    public static DataSourceRouteKey getRouteKey(){
        DataSourceRouteKey key = routeKey.get();
        return key;
    }

    public static void  setRouteKey(DataSourceRouteKey key)    {
        routeKey.set(key);
    }

    public static void removeRouteKey() {
        routeKey.remove();
    }

    public static void exchangeKey(DataSourceRouteKey dataSourceRouteKey){
        if(dataSourceRouteKey.equals(getRouteKey())){
            return;
        }else {
            System.out.println("exchange datasource to "+dataSourceRouteKey.getKey());
            setRouteKey(dataSourceRouteKey);
        }
    }
}
