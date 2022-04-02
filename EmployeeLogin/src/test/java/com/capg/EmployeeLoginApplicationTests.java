package com.capg;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.entity.Employee_entity;
import com.capg.repository.Employee_repository;

@SpringBootTest
class EmployeeLoginApplicationTests {

	@Autowired
	Employee_repository emrepo;
	
	
	@Test
	public void testCreate() {
		
		
		Employee_entity e = emrepo.findByEmployeeidAndPassword("ishika123@gmail.com","ishika123");
		assertThat(e.getEmployeeid()).isEqualTo("ishika123@gmail.com");
		assertThat(e.getPassword()).isEqualTo("ishika123");
		
		
		//Employee_entity e = new Employee_entity();
		
		
//		e.setEmployeeid("ishika123@gmail.com");
//		e.setPassword("ishika123");
//		emrepo.save(e);
//		
		
	}

}
