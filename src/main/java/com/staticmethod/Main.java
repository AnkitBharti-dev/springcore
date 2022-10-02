package com.staticmethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = 
				new ClassPathXmlApplicationContext("com/staticmethod/config.xml");
		State stat = con.getBean("state", State.class);
		System.out.println(stat);
		con.close();
	}
}
