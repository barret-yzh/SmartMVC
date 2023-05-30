package com.yzh.smartmvc.spi;


import com.yzh.smartmvc.annotation.MyUserParam;
import com.yzh.smartmvc.handler.ModelAndViewContainer;
import com.yzh.smartmvc.handler.argument.HandlerMethodArgumentResolver;
import com.yzh.smartmvc.vo.UserVo;
import org.springframework.core.MethodParameter;
import org.springframework.core.convert.ConversionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(MyUserParam.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, HttpServletRequest request,
                                  HttpServletResponse response, ModelAndViewContainer container,
                                  ConversionService conversionService) throws Exception {
        MyUserParam annotation = parameter.getParameterAnnotation(MyUserParam.class);
        String param = request.getParameter(annotation.name());
        String[] split = param.split(",");

        UserVo userVo = new UserVo();
        userVo.setName(split[0]);
        userVo.setAge(Integer.valueOf(split[1]));
        return userVo;
    }
}
