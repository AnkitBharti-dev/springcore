package com.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("ankit")
	private String name;
	@Value("rohtak")
	private String city;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
}
