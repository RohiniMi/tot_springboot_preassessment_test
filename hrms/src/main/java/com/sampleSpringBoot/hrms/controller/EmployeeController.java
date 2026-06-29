package com.sampleSpringBoot.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sampleSpringBoot.hrms.service.EmployeeService;
import com.sampleSpringBoot.hrms.model.EmployeeModel;

import java.util.*;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String greeting() {
		return "Hello";
	}

	@GetMapping("/employee")
	public List<EmployeeModel> showAllEmployee() {
		return employeeService.getAllEmployee();
	}
	@GetMapping("employee/{id}")
	public EmployeeModel getEmployeeByID(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	@PostMapping("/employee")
	public String createEmployee(@RequestBody EmployeeModel emp) {
		return employeeService.createEmployee(emp);
	}
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody EmployeeModel emp) {
		return employeeService.updateEmployee(emp);
	}
	@DeleteMapping(("/employee/{id}"))
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}

}
