package com.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = 
				new ClassPathXmlApplicationContext("com/stereotype/config.xml");
		System.out.println(con.getBean("student", Student.class));
		con.close();
	}
}
