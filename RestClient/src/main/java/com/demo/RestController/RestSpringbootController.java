package com.demo.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestSpringbootController {
	@RequestMapping("/hello")
 public String hello(){
		
	return "Hello World" ;
	
	}
	@GetMapping(value="/callclienthello")
	private String getHelloClient() {
		String uri="http://localhost:8086/hello";
		RestTemplate restTemplate = new RestTemplate();
		String result=restTemplate.getForObject(uri,String.class);
		return result;
	 
	}
//	@PostMapping(value="/callclienthello")
//	private String postHelloClient() {
//	String uri="http://localhost:8080/hello";
//		RestTemplate restTemplate = new RestTemplate();
//		String result=restTemplate.postForObject(uri, restTemplate, String.class);
//		return result;
//	 
//	}
}
