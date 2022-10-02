package com.contructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("com/contructor/config.xml");
		
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(context.getBean("student1", Student.class));
		context.close();
	}

}
