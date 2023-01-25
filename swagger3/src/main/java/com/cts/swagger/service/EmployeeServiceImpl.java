package com.cts.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.swagger.model.Employee;
import com.cts.swagger.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).get();
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeRepo.save(emp);
	}

	@Override
	public void updateEmployee(int id, Employee emp) {
		// TODO Auto-generated method stub
		employeeRepo.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}

}
