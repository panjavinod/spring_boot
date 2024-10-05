package com.demo.Controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.Entity.User;
import com.demo.Service.UserService;




@RestController
public class Controller {
	   
//	 @GetMapping("/user")
//	 public List<User> getAllEmployees() {
//		 return UserService.getAllEmployees();
//	 }
	RestTemplate restTemplate = new RestTemplate();
	@RequestMapping(value = "/users")
	 public List<User> getAllEmployees() {
		 String url="http://localhost:8080/auth/realms/master/protocol/openid-connect/token";
		 HttpHeaders headers = new HttpHeaders(); 
		 headers.set("Authorization", "Bearer " + url); 
		 headers.setContentType(MediaType.APPLICATION_JSON);

		 HttpEntity <User> entity = new HttpEntity <> (headers);
//		 return restTemplate.exchange(url, HttpMethod.GET, entity, User.class).getBody();
		 ResponseEntity <User> response = restTemplate.exchange(url, HttpMethod.POST, entity, User.class);
	 return UserService.getAllEmployees();
	 }
//	@GetMapping(value="/users")
//	private List<Object> getAllEmployees(){
//	String url = "http://localhost:8080/auth/realms/master/protocol/openid-connect/token";
//	RestTemplate restTemplate = new RestTemplate();
//	Object[] user= restTemplate.getForObject(url, Object[].class);
//	return Arrays.asList(user);
//	}

//	@PostMapping("/users")
//
//	 public User addEmployee(@RequestBody User employee) {
//		return UserService.addEmployee(employee);
//	 }
	
}
