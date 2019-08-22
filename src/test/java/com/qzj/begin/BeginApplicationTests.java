package com.qzj.begin;

import com.qzj.begin.bean.YmlTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @SpringBootTest 说明这是SpringBoot单元测试
 * @RunWith(SpringRunner.class) 指明用Spring的驱动器测试
 * 可以在测试期间类似编码一样进行自动注入及其他容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BeginApplicationTests {
	/**
	 * @Autowired 可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
	 * 通过 @Autowired 的使用来消除 Setter ，Getter方法。
	 */
	@Autowired
	YmlTest ymlTest;

	@Autowired
	ApplicationContext ioc;

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void testHelloService(){
		//判断有没有指定的bean
		System.out.println(ioc.containsBean("helloService"));
	}

	/**
	 * 利用junit进行测试
	 */
	@Test
	public void contextLoads() {
		System.out.println(ymlTest);
		//日志的级别；
		// 由低到高 trace<debug<info<warn<error
		// 可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
		logger.trace("这是trace日志...");
		logger.debug("这是debug日志...");
		//SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
		logger.info("这是info日志...");
		logger.warn("这是warn日志...");
		logger.error("这是error日志...");
	}

}
