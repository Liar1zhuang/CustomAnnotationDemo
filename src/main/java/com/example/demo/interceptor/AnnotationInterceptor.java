package com.example.demo.interceptor;

import com.example.demo.annotation.RWSwitch;
import com.example.demo.dataDource.DynamicDataSourceHolder;
import org.springframework.lang.Nullable;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @描述:注解拦截器
 * @Author:zhuangxinan
 * @Date:2021/2/2 11:55
 */
public class AnnotationInterceptor implements HandlerInterceptor{

    DynamicDataSourceHolder dynamicDataSourceHolder;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        RWSwitch annotation = handlerMethod.getMethodAnnotation(RWSwitch.class);
        if(annotation==null){
            return true;
        }
        //如果当前数据源与注解不符，切换数据源
        dynamicDataSourceHolder.exchangeKey(annotation.source());
        System.out.println("method = "+handlerMethod.getMethod().getName()+"key = "+annotation.source().getKey() + DynamicDataSourceHolder.getRouteKey().getKey() );
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
