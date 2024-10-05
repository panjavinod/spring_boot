package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);
		Employee e=context.getBean(Employee.class);
		e.show();
		
//		Employee e1=context.getBean(Employee.class);
//		e1.show();
		
		
	}

}
