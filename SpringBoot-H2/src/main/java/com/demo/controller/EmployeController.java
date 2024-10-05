package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employe;
import com.demo.service.EmployeService;

@RestController
public class EmployeController {
    @Autowired
	EmployeService empservice;
    
    @GetMapping("/employes")
    public List<Employe> getAllUsers(Employe employe){
		return empservice.getAllUsers(employe);
    	}
    @GetMapping("/employe/{id}")
    public Optional<Employe> getUser(@PathVariable int id) {
		return empservice.getUser(id);
    	}
    @PostMapping("/employe")
    public int saveUser(@RequestBody Employe employe) {
		 empservice.SvaeEmploye(employe);
		 return employe.getId();
    	}
    @DeleteMapping("/employe/{id}")
    public String deleteUser(@PathVariable int id) {
    	empservice.deleteEmploye(id);
		return "Employe deleted sucessfully";
    	
    }
}
