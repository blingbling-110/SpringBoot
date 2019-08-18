package com.qzj.begin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class BeginApplication {

	public static void main(String[] args) {
		//启动Spring应用
		SpringApplication.run(BeginApplication.class, args);
	}

}
