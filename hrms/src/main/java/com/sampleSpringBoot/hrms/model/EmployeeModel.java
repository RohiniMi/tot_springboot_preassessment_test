package com.sampleSpringBoot.hrms.model;

public class EmployeeModel {
	private String name;
	private int id;
	private String department;
	private String company;

	public EmployeeModel(String name, int id, String department, String company) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return id;
	}

	public String getDepartment() {
		return department;
	}

	public String getCompany() {
		return company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
