package com.yzh.smartmvc.handler.exception;

import com.yzh.smartmvc.annotation.ControllerAdvice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.util.Assert;
import static java.util.stream.Collectors.toList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ControllerAdviceBean {
    private String beanName;
    private Class<?> beanType;
    private Object bean;

    public ControllerAdviceBean(String beanName, Object bean) {
        Assert.notNull(bean, "Bean must not be null");
        this.beanType = bean.getClass();
        this.beanName = beanName;
        this.bean = bean;
    }


    public static List<ControllerAdviceBean> findAnnotatedBeans(ApplicationContext context) {
        Map<String, Object> beanMap = BeanFactoryUtils.beansOfTypeIncludingAncestors(context, Object.class);
        return beanMap.entrySet().stream()
                .filter(entry -> hasControllerAdvice(entry.getValue()))
                .map(entry -> new ControllerAdviceBean(entry.getKey(), entry.getValue()))
                .collect(toList());
    }

    private static boolean hasControllerAdvice(Object bean) {
        Class<?> beanType = bean.getClass();
        return (AnnotatedElementUtils.hasAnnotation(beanType, ControllerAdvice.class));
    }
}