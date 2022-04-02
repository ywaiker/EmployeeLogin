package com.capg.contrpller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.capg.entity.Employee_entity;
import com.capg.repository.Employee_repository;


@Controller
@RequestMapping("/employee")
public class EmployeeLogin_controller {
	
	
	@Autowired
	private Employee_repository employee_repositor ;
	
	@PostMapping("/employeeLogin")
	
public ResponseEntity<Employee_entity> createUser(@RequestBody Employee_entity login){
		
		Employee_entity info =  employee_repositor.findByEmployeeidAndPassword(login.getEmployeeid(),login.getPassword());
		
		//return ResponseEntity.ok(info);
		return new ResponseEntity<Employee_entity>( info,HttpStatus.ACCEPTED);
		
		  
		
	}
	

}
