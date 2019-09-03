package com.qzj.begin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//实现WebMvcConfigurer接口可以扩展SpringMVC的功能
//@EnableWebMvc 全面接管SpringMVC
//@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    //addViewControllers实现一个请求直接映射成视图，不需要控制器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/qzj").setViewName("success");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }
}
