package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WebController {
	

		@RequestMapping("home")
		public String home() 
		{
				System.out.println("hii");	
				return "home";
		}

}
