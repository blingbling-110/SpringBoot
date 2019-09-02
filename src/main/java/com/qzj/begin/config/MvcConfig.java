package com.qzj.begin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//实现WebMvcConfigurer接口可以扩展SpringMVC的功能
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //"/qzj"请求映射到"success"
        registry.addViewController("/qzj").setViewName("success");
    }
}