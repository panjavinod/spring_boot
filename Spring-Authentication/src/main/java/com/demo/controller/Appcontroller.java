package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Appcontroller {
       
	@GetMapping("/get")
	public String greetings() {
		return "AUTHENTICATION SUCCESS";
		
	}
}
