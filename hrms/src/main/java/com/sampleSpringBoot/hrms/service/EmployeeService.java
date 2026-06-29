package com.sampleSpringBoot.hrms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sampleSpringBoot.hrms.repository.EmployeeRepository;
import com.sampleSpringBoot.hrms.model.EmployeeModel;
import java.util.*;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<EmployeeModel> getAllEmployee() {
		return employeeRepository.getAllEmployee();
	}
	public EmployeeModel getEmployee(int id) {
		return employeeRepository.getEmployeeById(id);
	}
	public String createEmployee(EmployeeModel emp) {
		return employeeRepository.createEmployee(emp);
	}
	public String updateEmployee(EmployeeModel emp) {
		return employeeRepository.updateEmployee(emp);
	}
	public String deleteEmployee(int id) {
		return employeeRepository.deleteEmployeeById(id);
	}

}
