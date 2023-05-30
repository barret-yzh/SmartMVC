package com.yzh.smartmvc;

import com.yzh.smartmvc.configurure.context.ServletWebServerApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartmvcSpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SmartmvcSpringbootDemoApplication.class);
        application.setMainApplicationClass(ServletWebServerApplicationContext.class);
        application.run(args);
    }

}
