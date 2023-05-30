package com.yzh.smartmvc.configurure.context;

import org.springframework.boot.web.server.WebServer;

public interface WebServerApplicationContext {
    WebServer getWebServer();
}
