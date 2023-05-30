package com.yzh.smartmvc.view.resolver;

import com.yzh.smartmvc.view.InternalResourceView;
import com.yzh.smartmvc.view.View;

public class InternalResourceViewResolver extends UrlBasedViewResolver {
    @Override
    protected View buildView(String viewName) {
        String url = getPrefix() + viewName + getSuffix();
        return new InternalResourceView(url);
    }
}