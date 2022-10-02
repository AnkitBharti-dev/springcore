package com.reference;

import com.collections.Employee;

public class Records {
	private int empId;
	private Employee employee;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "Records [empId=" + empId + ", employee=" + employee + "]";
	}
}
