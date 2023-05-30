package com.yzh.smartmvc.handler.mapping;


import com.yzh.smartmvc.annotation.RequestMapping;
import com.yzh.smartmvc.http.RequestMethod;

public class RequestMappingInfo {
    private String path;
    private RequestMethod httpMethod;

    public RequestMappingInfo(String prefix, RequestMapping requestMapping) {
        this.path = prefix + requestMapping.path();
        this.httpMethod = requestMapping.method();
    }

    public String getPath() {
        return path;
    }

    public RequestMethod getHttpMethod() {
        return httpMethod;
    }

}