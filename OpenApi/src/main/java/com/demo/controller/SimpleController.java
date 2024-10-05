package com.demo.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {
  @GetMapping("/public")
  public String getPublicResource(HttpServletRequest httpServletRequest) {
	return "This is a public resource" + new Date().toString();
	  
  }
  @GetMapping("/private")
  public String getPrivateResource() {
	return "This is a private resource" +new Date().toString();
	  
  }
}
