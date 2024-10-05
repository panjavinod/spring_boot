package com.eureka.discovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Environment env;

	@GetMapping("/status/check")
	public String status() {
		System.out.println("Port Number"+env.getProperty("local.server.port"));
		return "Port Number"+env.getProperty("local.server.port");
	}
}
