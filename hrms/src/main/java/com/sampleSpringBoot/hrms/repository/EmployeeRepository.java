package com.sampleSpringBoot.hrms.repository;

import org.springframework.stereotype.Repository;
import com.sampleSpringBoot.hrms.model.EmployeeModel;

import java.util.*;
import java.util.stream.Stream;

@Repository
public class EmployeeRepository {
	ArrayList<EmployeeModel> employee = new ArrayList<>();

	public EmployeeRepository() {
		employee.add(new EmployeeModel("Rohini", 1, "CSE", "ABES"));
		employee.add(new EmployeeModel("Saniya", 2, "CSE", "ABES"));
		employee.add(new EmployeeModel("Somya", 3, "CSE", "ABES"));
		employee.add(new EmployeeModel("RohiniMi", 4, "CSE", "ABES"));
	}

	public List<EmployeeModel> getAllEmployee() {
		return employee;
	}

	public EmployeeModel getEmployeeById(int id) {
		EmployeeModel emp = employee.stream().filter((e) -> e.getID() == id).findFirst().orElse(null);
		return emp;
	}

	public String createEmployee(EmployeeModel emp) {
		employee.add(emp);
		return "Employee has been add successfully";
	}

	public String updateEmployee(EmployeeModel emp) {
		EmployeeModel existingEmp = getEmployeeById(emp.getID());
		if (existingEmp != null) {
			existingEmp.setName(emp.getName());
			existingEmp.setDepartment(emp.getDepartment());
			existingEmp.setCompany(emp.getCompany());
			return "Employee has been updated successfully";
		}
		return "Cant Update";

	}

	public String deleteEmployeeById(int id) {
		EmployeeModel existingEmp = getEmployeeById(id);
		if (existingEmp != null) {
			employee.removeIf(e -> e.getID() == id);
			return "Employee has been deleted successfully";
		}
		return "Employee does not exist";
	}
}
