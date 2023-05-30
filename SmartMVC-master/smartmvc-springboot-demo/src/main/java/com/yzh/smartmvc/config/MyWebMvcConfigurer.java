package com.yzh.smartmvc.config;

import com.yzh.smartmvc.handler.argument.HandlerMethodArgumentResolver;
import com.yzh.smartmvc.spi.MyHandlerMethodArgumentResolver;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new MyHandlerMethodArgumentResolver());
    }
}
