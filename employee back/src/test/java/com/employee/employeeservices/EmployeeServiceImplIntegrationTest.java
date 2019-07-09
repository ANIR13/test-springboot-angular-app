package com.employee.employeeservices;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.employeeservices.model.Employee;
import com.employee.employeeservices.repository.EmployeeRepository;
import com.employee.employeeservices.service.EmployeeService;
import com.employee.employeeservices.service.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplIntegrationTest {

	@TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public EmployeeService employeeService() {
            return new EmployeeServiceImpl();
        }
    }
	
    @Autowired
    private EmployeeService employeeService;
 
    @MockBean
    private EmployeeRepository employeeRepository;	
	
    @Before
    public void setUp() {
    	
    	Employee employee = new Employee("Alex", "Trabek"); 
    	employee.setId(10005l);
    	
        Optional<Employee> employeeOptional = Optional.of(employee);

        Mockito.when(employeeRepository.findById(Mockito.anyLong()))
        .thenReturn(employeeOptional);
        
    }
    
    @Test
    public void whenFindById_thenEmployeeShouldBeFound() {
    	// given
    	Long id = 10005l;
    	Employee expectedEmployee = new Employee("Alex", "Trabek"); 
    	expectedEmployee.setId(id);
      
    	// when
    	Employee actualEmployee = employeeRepository.findById(id).get();
    	
    	// then
         assertThat(expectedEmployee)
          .isEqualTo(actualEmployee);
     }
    
    
    
}
