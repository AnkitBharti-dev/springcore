package com.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/collections/config.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		context.close();
	}
}
