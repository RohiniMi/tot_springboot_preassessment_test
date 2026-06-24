package com.hr;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String Housenumber = "I709";
	String Societyname = "Delhi99";
	String city = "New Delhi";
	String Country = "India";

	String getHomenumber() {
		return Housenumber;
	}

	String getSocietyname() {
		return Societyname;
	}
}