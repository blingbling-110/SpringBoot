package com.qzj.begin.bean;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器：进行登录检查
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    //在目标方法执行之前拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object usr = request.getSession().getAttribute("loginUser");
        if (usr == null) {
            request.setAttribute("msg", "没有权限，请先登录");
            request.getRequestDispatcher("/").forward(request, response);//返回登录页面
            return false;
        } else
            return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
