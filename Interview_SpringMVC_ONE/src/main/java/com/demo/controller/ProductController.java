package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class ProductController {
	
	@RequestMapping("/")
	public String start() {
		return "start.jsp";
		
	}
	
	@RequestMapping("/home")
	public String valid() {
		return "home.jsp";
		
	}
	
	@PostMapping(value="/addEmploye")
	 public String display(@RequestParam("name") String name,@RequestParam("password") String password,Model m)  
    {  
        if(password.equals("admin"))  
        {  
            String msg="Hello "+ name;  
            //add a message to the model  
            m.addAttribute("message", msg);  
            return "success.jsp";  
        }  
        else  
        {  
            String msg="Sorry "+ name+". You entered an incorrect password";  
            m.addAttribute("message", msg);  
            return "error.jsp";  
        }     
    }  
	
//	@RequestMapping("/")
//	public String start() {
//		return "index.jsp";
//		
//	}
//
//	@RequestMapping("/hello")
//	public String reDirect() {
//		return "viewpage.jsp";
//		
//	}
//	@RequestMapping("/helloagain")  
//	public String display()  
//	{  
//	    return "final";  
//	}
	
	
	

}
