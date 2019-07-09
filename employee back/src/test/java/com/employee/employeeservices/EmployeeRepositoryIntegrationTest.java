package com.employee.employeeservices;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.employeeservices.model.Employee;
import com.employee.employeeservices.repository.EmployeeRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Test
    public void whenFindById_thenReturnEmployee() {
    	// given
    	Long id = 10001l;
    	Employee expectedEmployee = new Employee("James", "Bond");
    	expectedEmployee.setId(id);
    	
    	// when
    	Employee actualEmployee = employeeRepository.findById(id).get();
    	
    	// then
    	assertThat(actualEmployee).isEqualTo(expectedEmployee);    	
    }
	
    @Test
    public void whenFindAllEmployeeSize_thenReturnEmployeeSize() {
    	// given
    	int expectedEmployeeCount = 4;
    	
    	// when
    	List <Employee> employeeList = employeeRepository.findAll();
    	
    	// then
    	assertThat(expectedEmployeeCount).isEqualTo(employeeList.size());    	
    }
    
	
}
