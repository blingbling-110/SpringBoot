package com.qzj.begin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
     * @RequestMapping("/hello")表示响应浏览器的"/hello"请求
     * @return 要响应的返回值
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!" + who;
    }
}
