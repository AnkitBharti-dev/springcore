package com.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("com/reference/config.xml");
		
		Records record1 = context.getBean("employee1", Records.class);
		Records record2 = context.getBean("employee2", Records.class);
		System.out.println(record1);
		System.out.println(record2);
		context.close();
	}

}
