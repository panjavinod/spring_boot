package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HController {
	@RequestMapping("show")
	public String show() {
		System.out.println("Hello World");
		return "NewFile.jsp";
	}

}
