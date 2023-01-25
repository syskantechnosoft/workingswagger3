package com.cts.swagger.service;

import java.util.List;

import com.cts.swagger.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public Employee getEmployeeById(int id);

	public void addEmployee(Employee emp);

	public void updateEmployee(int id, Employee emp);

	public void deleteEmployee(int id);
}
