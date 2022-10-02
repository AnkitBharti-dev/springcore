package com.collections;

import java.util.List;
import java.util.Map;

public class Employee {
	private String name;
	private List<String> hobbies;
	private Map<String,String> address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hobbies=" + hobbies + ", address=" + address + "]";
	}
}
