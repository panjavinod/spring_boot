package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {
	
@RequestMapping("/show")
 public ModelAndView show(Alien alien) {
	 ModelAndView m=new ModelAndView();
	 
	 m.addObject("obj",alien);
	 System.out.println(alien);
	 m.setViewName("home");
	 return m;
 }
}
