package com.qzj.begin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller表示它能处理浏览器请求
 */
@Controller
public class HelloController {

    /**
     * @ResponseBody表示用返回值响应浏览器
     * @RequestMapping("/hello")表示响应浏览器的"/hello"请求
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
