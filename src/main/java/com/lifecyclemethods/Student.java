package com.lifecyclemethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	private int rollNo;
	private String name;
	private String address;
	
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Destroy Method");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet Method");
	}
	
	public void init() {
		System.out.println("This is intit");
	}
	
	public void destroy1() {
		System.out.println("This is destroy");
	}
}
