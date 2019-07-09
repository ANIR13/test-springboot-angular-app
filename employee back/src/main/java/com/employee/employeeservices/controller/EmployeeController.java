package com.employee.employeeservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeservices.model.Employee;
import com.employee.employeeservices.service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees/hello")
	public String sayHello(){
		return "Hello from employee controller";
	}
	
	
	public Employee getFakeEmployee(){
		return new Employee("akrouh", "Mohamed");
	}
	
	
	@GetMapping("/employees")
	public List <Employee> getEmployees(){
		return employeeService.findAllEmployees();
	}
	
	
	@GetMapping("employees/id/{id}")
	public Employee geEmployeeById(@PathVariable(value="id") Long id){
		return employeeService.findById(id);
	}
	
	@GetMapping("/employees/firstName/{firstName}")
	public List <Employee> getEmployee(@PathVariable(value = "firstName") String firstName){
		return employeeService.findByFirstName(firstName);
	}

}
