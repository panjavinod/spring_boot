package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JunitController {
	@RequestMapping("junit")
	public String junit() {
		
		return "JUNIT TEST CASES";
		
	}

}
