package com.yzh.smartmvc.view.resolver;

import com.yzh.smartmvc.view.View;

public interface ViewResolver {
    View resolveViewName(String viewName) throws Exception;
}