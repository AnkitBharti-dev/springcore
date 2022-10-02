package com.utillist;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("com/utillist/config.xml");
		
		Test test = context.getBean("test", Test.class);
		System.out.println(test);
		context.close();
	}

}
