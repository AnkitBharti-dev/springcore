package com.staticmethod;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("state")
public class State {
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double sqrt;
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	@Value("#{new java.lang.String('ankit')}")
	private String name;
	@Value("#{2>4}")
	private boolean bool;
	
	@Override
	public String toString() {
		return "State [sqrt=" + sqrt + ", pi=" + pi + ", name=" + name + ", bool=" + bool + "]";
	}
}
