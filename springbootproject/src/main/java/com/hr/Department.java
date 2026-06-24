package com.hr;

import org.springframework.stereotype.Component;

@Component
public class Department {
	String name = "CSE Department";

	public String getName() {
		return name;
	}
}