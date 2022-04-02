package com.capg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Login")
public class Employee_entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String employeeid;
	@Column
	private String password;
	
	
	
	//constructor
	
public Employee_entity(int id, String employeeid, String password) {
		super();
		this.id = id;
		this.employeeid = employeeid;
		this.password = password;
	}

//Getter and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee_entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee_entity [id=" + id + ", employeeid=" + employeeid + ", password=" + password + "]";
	}
	
	
	
	
	

}
