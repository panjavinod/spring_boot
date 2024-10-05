package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Login;
import com.demo.model.User;
import com.demo.service.UserService;

@RestController
public class UserController {

    @Autowired
	public UserService userService;
    
	
	@PostMapping("/create")
	public String registerUser(@RequestBody User user) {
			userService.createUser(user);
			return "Registration Successfull";	
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestBody Login login) {
		String loginResponse=userService.loginUser(login);
		return loginResponse;
			
	}
	
	
}
