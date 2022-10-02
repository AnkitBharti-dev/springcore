package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {
	
	@Autowired
	@Qualifier("student1")
	private Student student;

	@Override
	public String toString() {
		return "Test [student=" + student + "]";
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
