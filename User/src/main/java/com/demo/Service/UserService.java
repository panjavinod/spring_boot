package com.demo.Service;

import java.util.ArrayList;

import java.util.List;



import com.demo.Entity.User;






public class UserService {
	private static List<User> employees= new ArrayList<>();
	
	
   //for get the all employees
	public static List<User> getAllEmployees() {
		return new ArrayList<>(employees);
	}
	// for add the new employee
//	public static User addEmployee(User employee) {
//		
//		employees.add(employee);
//		return employee;
//	}
}
