package com.qzj.begin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 * @ImportResource 标注在该主程序类上以导入外部Spring配置文件
 */
@SpringBootApplication
//@ImportResource(locations = {"classpath:beans.xml"})
public class BeginApplication {

	public static void main(String[] args) {
		//启动Spring应用
		SpringApplication.run(BeginApplication.class, args);
	}

}
