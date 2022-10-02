package com.autowiringbean;

public class Address {
	private int houseNo;
	private String street;
	private String city;
	
	public Address(int houseNo, String street, String city) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + "]";
	}
}
