package com.qzj.begin.bean;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 区域信息解析器
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l"); // 将请求参数解析成字符串
        Locale locale = Locale.getDefault(); // 获取JVM默认区域信息
        if (!StringUtils.isEmpty(l)) {
            locale = new Locale(l.split("_")[0], l.split("_")[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
