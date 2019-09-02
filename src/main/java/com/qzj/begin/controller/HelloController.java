package com.qzj.begin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @Controller 表示它能处理浏览器请求
 */
@Controller
public class HelloController {
    /**
     * @Value 获取配置文件中的值
     */
    @Value("${ymltest.str_test1}")
    private String who;

    /**
     * @ResponseBody 表示用返回值响应浏览器
     * @RequestMapping("/hello") 表示响应浏览器的"/hello"请求
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!" + who;
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好<h1>");
        map.put("users", Arrays.asList("超级管理员", "管理员", "用户"));
        //thymeleaf会根据返回值来渲染"classpath:/templates/"路径下的"<返回值>.html"资源
        return "success";
    }
}
