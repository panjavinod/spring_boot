package com.ms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ms.entity.Student;
import com.ms.repository.StudentRepository;
import com.ms.valueobjects.Department;
import com.ms.valueobjects.StudentDepartmentVo;

@Service
public class StudentService {

	@Autowired
	StudentRepository  studentRepository;
	
	@Autowired
	RestTemplate  restTemplate;
	
	private String baseUrl="http://DEPARTMENTSERVICE:8080/department/";
	
	@Autowired
	MailService mailService;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public String getStudnetwithDepartment(Long Id) {	
		Student student=studentRepository.findById(Id).get();
		Department department=restTemplate.getForObject(baseUrl+student.getDepartmentId(),Department.class);
//		StudentDepartmentVo vo=new StudentDepartmentVo();  StudentDepartmentVo return type
//		vo.setDepartment(department);
//		vo.setStudent(student);
//		return vo;
		StringBuffer buffer=new StringBuffer();
		buffer.append("please find below");
		buffer.append("/n");
		buffer.append(student.getStudentId()+" "+student.getFirstName()+" "+student.getLastName()+" "+student.getEmail()+" "+student.getDepartmentId());
		buffer.append("/n");
		buffer.append(department.getDepartmentName()+" "+department.getDepartmentAddress()+" "+department.getDepartmentCode());
		mailService.sendMail("vinnupanja06@gmail.com","Studnet with Department Details",buffer.toString());
		return "Student with Department Details sent to mail";
	}
}
