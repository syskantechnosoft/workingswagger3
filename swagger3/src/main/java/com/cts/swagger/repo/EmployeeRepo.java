package com.cts.swagger.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.swagger.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
