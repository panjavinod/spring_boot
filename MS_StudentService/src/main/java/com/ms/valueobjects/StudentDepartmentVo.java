package com.ms.valueobjects;

import com.ms.entity.Student;




public class StudentDepartmentVo {

	private Student student;
	private Department department;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
