package com.capg.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.capg.entity.Employee_entity;

@Repository
public interface Employee_repository extends CrudRepository<Employee_entity, Integer> {
	
	public Employee_entity findByEmployeeidAndPassword(String employeeid,String password);	

}
