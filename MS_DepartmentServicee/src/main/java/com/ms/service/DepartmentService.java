package com.ms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.entity.Department;
import com.ms.repository.DepartmentRepository;

@Service
public class DepartmentService {
    @Autowired
	DepartmentRepository  departmentRepository;
    
    public Department saveDepartment(Department department) {
    	return departmentRepository.save(department);
    }
    
    public Optional<Department> getBydepartmentId(Long Id) {
		return departmentRepository.findById(Id);
    	
    }
}
