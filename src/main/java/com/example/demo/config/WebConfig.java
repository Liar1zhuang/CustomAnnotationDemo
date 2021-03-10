package com.example.demo.config;

import com.example.demo.interceptor.AnnotationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @描述:配置文件，注册注解拦截器
 * @Author:zhuangxinan
 * @Date:2021/2/2 11:53
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Bean
    public AnnotationInterceptor annotationInterceptor(){return new AnnotationInterceptor();}

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(annotationInterceptor());
    }
}
