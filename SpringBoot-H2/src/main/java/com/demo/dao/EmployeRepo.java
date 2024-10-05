package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employe;

public interface EmployeRepo extends JpaRepository<Employe,Integer>{

}
