package com.cts.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.swagger.model.Employee;
import com.cts.swagger.service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
	}

	@PutMapping("/employees/{id}")
	public void updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
		employeeService.updateEmployee(id, emp);
	}

}
