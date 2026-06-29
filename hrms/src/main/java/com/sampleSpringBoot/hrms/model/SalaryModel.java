package com.sampleSpringBoot.hrms.model;

import org.springframework.stereotype.Component;

public class SalaryModel {
	private String empname;
	private int empid;
	private double da;
	private double basic;
	private double hra;
	private double totalpay;

	public SalaryModel(String empname, int empid, double da, double hra, double basic, double totalpay) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.da = da;
		this.basic = basic;
		this.hra = hra;
		this.totalpay = totalpay;

	}

	public String getName() {
		return empname;
	}

	public int getId() {
		return empid;
	}

	public double getDA() {
		return da;
	}

	public double getHRA() {
		return hra;
	}

	public double getBASIC() {
		return basic;
	}

	public double getTotalPay() {
		return totalpay;
	}

	public void setEmpName(String empname) {
		this.empname = empname;
	}

	public void setEmpID(int empid) {
		this.empid = empid;
	}

	public void setDA(double da) {
		this.da = da;
	}

	public void setHRA(double hra) {
		this.hra = hra;
	}

	public void setBASIC(double basic) {
		this.basic = basic;
	}

	public void setTotalPay(double totalpay) {
		this.totalpay = totalpay;
	}
}
