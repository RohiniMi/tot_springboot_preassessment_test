package com.hr;

import org.springframework.stereotype.Component;

@Component
public class Salary {
	double basic = 45000.90;
	double hra = 6677.00;
	double da = 90000.00;
	double special_allowance = 100000;

	public double getBasic() {
		return basic;
	}

	public double getSpecial_allowance() {
		return special_allowance;
	}
}