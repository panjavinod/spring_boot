package com.springboot;
 import java.util.*;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


 @RestController
 
public class EmployeeController {
	 
	 
	 @GetMapping("/employees")
//   @RolesAllowed("admin")
	 public List<Employee> getAllEmployees() {
		 return EmployeeService.getAllEmployees();
	 }
	 
	 @GetMapping("/employee/{employeeId}")
     public Employee getEmployeeDetails(@PathVariable Long employeeId) {
    	 return EmployeeService.getEmployeeDetails(employeeId);
     }
	 
	 @PostMapping("/addEmployee")
//    @RolesAllowed("user")
	 public Employee addEmployee(@RequestBody Employee employee) {
		return EmployeeService.addEmployee(employee);
	 }
	 
	 @PutMapping("/updateEmployee/{employeeId}")
	 public Employee updateEmployee(@PathVariable Long employeeId, @RequestBody Employee employee) {
		 return EmployeeService.updateEmployee(employeeId, employee);
	 }
	 
	 @DeleteMapping("/deleteEmployee/{employeeId}")
	 public Employee deleteEmployee(@PathVariable Long employeeId) {
		 return EmployeeService.deleteEmployee(employeeId);
	 }
	 
	 
     
     
	

}
