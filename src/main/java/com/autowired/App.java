package com.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/autowired/config.xml");
		Test test = context.getBean("test", Test.class);
		System.out.println(test);
		
		System.out.println(context.getBean("student", Student.class));
		context.close();
		
	}
}