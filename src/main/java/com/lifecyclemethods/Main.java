package com.lifecyclemethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/lifecyclemethods/config.xml");
		context.close();
	}
}
