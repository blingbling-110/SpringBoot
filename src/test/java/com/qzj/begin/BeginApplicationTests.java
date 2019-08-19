package com.qzj.begin;

import com.qzj.begin.bean.YmlTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @SpringBootTest 说明这是SpringBoot单元测试
 * @RunWith(SpringRunner.class) 指明用Spring的驱动器测试
 * 可以在测试期间类似编码一样进行自动注入及其他容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BeginApplicationTests {
	@Autowired
	YmlTest ymlTest;

	@Test
	public void contextLoads() {
		System.out.println(ymlTest);
	}

}
