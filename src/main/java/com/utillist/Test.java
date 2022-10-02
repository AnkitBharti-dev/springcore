package com.utillist;

import java.util.List;
import java.util.Map;

public class Test {
	private List<String> friends;
	private Map<String, String> address;
	
	@Override
	public String toString() {
		return "Test [friends=" + friends + ", address=" + address + "]";
	}
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
}
