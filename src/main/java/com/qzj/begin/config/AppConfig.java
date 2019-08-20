package com.qzj.begin.config;

import com.qzj.begin.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot推荐使用全注解的方式给容器中添加组件
 * @Configuration 指明当前类是一个配置类，用于替代Spring配置文件
 * 配置文件：利用<bean></bean>标签添加组件
 * 配置类中利用 @Bean 来添加组件
 */
@Configuration
public class AppConfig {
    /**
     * @Bean 将方法的返回值添加到容器中，组件默认id为该方法名
     * @return 要添加的组件
     */
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
