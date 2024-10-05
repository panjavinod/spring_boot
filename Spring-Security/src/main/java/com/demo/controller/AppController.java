package com.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("/")
	public String greeting() {
		return "spring security example";
	}
	@GetMapping("/home")
	@PreAuthorize("hasRole('ADMIN')")
	public String greetings() {
		return "welcome to home";
	}
}
