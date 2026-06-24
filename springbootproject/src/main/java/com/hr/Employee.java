package com.hr;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	String eName = "Rohini";
	int age = 25;
	private Department department;
	private Address address;
	private Salary salary;

	public Employee(Department department, Address address, Salary salary) {
		super();
		this.department = department;
		this.address = address;
		this.salary = salary;
	}

	public void display() {
		System.out.println("*******Employee Details*********");
		System.out.println("Name:" + eName);
		System.out.println("age:" + age);
		System.out.println("Department name:" + department.getName());
		System.out.println("House number:" + address.getHomenumber());
		double totalSalary = salary.getBasic() + salary.getSpecial_allowance();
		System.out.println("Salary:" + totalSalary);
		System.out.println("********end********");
		;
	}
}