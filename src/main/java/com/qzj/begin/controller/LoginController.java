package com.qzj.begin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping("/user/login")
    //以上等价于@RequestMapping(value = "/user/login", method = RequestMethod.POST)
    //@RequestParam 将请求的参数与处理方法的参数绑定
    public String login(@RequestParam("username") String usr,
                        @RequestParam("password") String pwd,
                        Map<String, Object> map,
                        HttpSession session) {
        if (!StringUtils.isEmpty(usr) && "123456".equals(pwd)) {
            session.setAttribute("loginUser", usr);
//            return "dashboard";
            return "redirect:/main.html";//重定向，防止表单重复提交
        } else {
            map.put("msg", "用户名密码错误");
            return "index";
        }
    }
}
