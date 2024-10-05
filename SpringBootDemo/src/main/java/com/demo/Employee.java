package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") 
public class Employee {
	private int id;
	private String name;
	@Autowired
	private Adress adress;
	
	
	public Employee() {
		super();
		System.out.println("Enter The Employee");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public void show() {
		System.out.println("Employee Attended");
		adress.compiler();
	}
	

}
