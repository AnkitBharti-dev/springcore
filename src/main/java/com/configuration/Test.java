package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.configuration")
public class Test {
	@Bean(name="student1")
	public Student student() {
		return new Student();
	}
}
