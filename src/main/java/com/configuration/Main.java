package com.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = 
				new AnnotationConfigApplicationContext(Test.class);
		
		Student student = con.getBean("student1", Student.class);
		System.out.println(student);
		con.close();
	}

}
