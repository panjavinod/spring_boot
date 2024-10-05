package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Employe;
import com.demo.repo.EmployeRepo;

@Controller
public class MVC_Contoller {
	
	@Autowired
	EmployeRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
		
	}
	@PostMapping(value="/addEmploye")
	public String addEmploye(Employe data, Model model ) {
		repo.save(data);
		model.addAttribute("data",repo.findAll());
		return "success.jsp";
		
	}
}
