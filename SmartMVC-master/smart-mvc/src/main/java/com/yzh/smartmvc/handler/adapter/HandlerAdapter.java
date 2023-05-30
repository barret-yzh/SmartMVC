package com.yzh.smartmvc.handler.adapter;

import com.yzh.smartmvc.ModelAndView;
import com.yzh.smartmvc.handler.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HandlerAdapter {
    ModelAndView handle(HttpServletRequest request, HttpServletResponse response,
                        HandlerMethod handler) throws Exception;
}