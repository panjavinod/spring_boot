package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.EmploeRepo;
import com.demo.model.Employe;

@RestController
public class EmployeController {
	@Autowired
	EmploeRepo repo;
	
	@PostMapping("/employe")
	public Employe addEmploye(@RequestBody Employe employe) {
		repo.save(employe);
		return employe;
	}
	
	@GetMapping("/employes")
	public List<Employe> getEmployes(Employe employe) {
		return repo.findAll();
		
	}
	
	@GetMapping("/employe/{id}")
	public Employe getEmploye(@PathVariable("id") int id) {
		
//		Employe e=repo.getOne(id);
//      return e;
		
		return repo.getById(id);
		
	}
	
	@DeleteMapping("/employe/{id}")
	public String deleteEmploye(@PathVariable int id) {
		
		Employe e=repo.getOne(id);
		repo.delete(e);
		return "Employe Deleted Succesfully";
	}
	
	@PutMapping("/employe")
	public Employe updateEmploye(@RequestBody Employe employe) {
		repo.save(employe);
		return employe;
	}

}
