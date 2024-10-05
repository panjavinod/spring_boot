package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.UserRepo.UserRepo;
import com.demo.model.Login;
import com.demo.model.User;

@Service
public class UserService {

	@Autowired
	public UserRepo userRepo;

	public void createUser(User user) {
	
		if (!user.getPassword().equalsIgnoreCase(user.getConfirmPassword())) {
		
            throw new IllegalArgumentException("Password and confirm password do not match");
        }else {
        	if (userRepo.existsByEmail(user.getEmail())) {
                throw new IllegalArgumentException("Email already registered");
            }
        	else {
        		userRepo.save(user);
        	}
        }	
	}

	public String loginUser(Login login) {
		if(userRepo.existsByEmail(login.getEmail())) {
			if(userRepo.existsByPassword(login.getPassword())) {
				return "Login Successfull";
			}else {
				return "Password Wrong ";
			}
		}else {
			return "Email Wrong";
		}
				
	}


	
	
}
