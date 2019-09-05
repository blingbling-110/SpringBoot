package com.qzj.begin.config;

import com.qzj.begin.bean.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
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

    /**
     * WebMVC自动配置中的 @ConditionalOnMissingBean 若检测到 localResolver 就不再自动创建该Bean
     * @return 自定义区域信息解析器对象
     */
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
