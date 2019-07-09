package com.employee.employeeservices.service;

import java.util.List;

import com.employee.employeeservices.model.Employee;

public interface EmployeeService {

	public List <Employee> findAllEmployees();
	public Employee findById(Long id);
	public List <Employee> findByFirstName(String firstName);
	
	
	
}
