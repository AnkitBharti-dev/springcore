package com.autowiringbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/autowiring/config.xml");
		System.out.println(context.getBean("emp"));
		context.close();
	}

}
