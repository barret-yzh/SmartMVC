package com.yzh.smartmvc.config;

import com.yzh.smartmvc.DispatcherServlet;
import com.yzh.smartmvc.annotation.EnableWebMvc;
import com.yzh.smartmvc.handler.adapter.HandlerAdapter;
import com.yzh.smartmvc.handler.adapter.RequestMappingHandlerAdapter;
import com.yzh.smartmvc.handler.exception.ExceptionHandlerExceptionResolver;
import com.yzh.smartmvc.handler.exception.HandlerExceptionResolver;
import com.yzh.smartmvc.handler.mapping.HandlerMapping;
import com.yzh.smartmvc.handler.mapping.RequestMappingHandlerMapping;
import com.yzh.smartmvc.view.resolver.ContentNegotiatingViewResolver;
import com.yzh.smartmvc.view.resolver.InternalResourceViewResolver;
import com.yzh.smartmvc.view.resolver.ViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.support.DefaultFormattingConversionService;

import java.util.Collections;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.yzh.smartmvc")
public class AppConfig {
    @Bean
    public HandlerMapping handlerMapping() {
        return new RequestMappingHandlerMapping();
    }
    @Bean
    public HandlerAdapter handlerAdapter(ConversionService conversionService) {
        RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
        handlerAdapter.setConversionService(conversionService);
        return handlerAdapter;
    }
    @Bean
    public ConversionService conversionService() {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd HH:mm:ss");
        conversionService.addFormatter(dateFormatter);
        return conversionService;
    }
    @Bean
    public ViewResolver viewResolver() {
        ContentNegotiatingViewResolver negotiatingViewResolver = new ContentNegotiatingViewResolver();
        negotiatingViewResolver.setViewResolvers(Collections.singletonList(new InternalResourceViewResolver()));
        return negotiatingViewResolver;
    }
    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    public HandlerExceptionResolver handlerExceptionResolver(ConversionService conversionService) {
        ExceptionHandlerExceptionResolver resolver = new ExceptionHandlerExceptionResolver();
        resolver.setConversionService(conversionService);
        return resolver;
    }

}
