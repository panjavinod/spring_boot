package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ms.entity.Student;
import com.ms.service.StudentService;
import com.ms.valueobjects.StudentDepartmentVo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/{id}")
	@CircuitBreaker(name="studentservice",fallbackMethod="fallbackMethod")
	public String getStudentWithDepartment(@PathVariable Long id) {
	 return studentService.getStudnetwithDepartment(id);
	 
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	public String fallbackMethod(@PathVariable Long id,RuntimeException ex) {
		return "Service is down. Please try after some time.";
	}
}
