package com.contructor;

public class Student {
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
	
	public void init() {
		System.out.println("This is intit");
	}
	
	public void destroy() {
		System.out.println("This is destroy");
	}
}
