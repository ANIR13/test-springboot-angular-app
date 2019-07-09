package com.employee.employeeservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeeservices.model.Employee;
import com.employee.employeeservices.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public List <Employee> findByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

	
	
	
}
