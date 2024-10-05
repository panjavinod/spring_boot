package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InterviewSpringIocUSingAnnotationConfigApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);
	Mobiles obj=(Mobiles) context.getBean("getOnePlusObject",Mobiles.class);
	obj.getModelAndColur();
	}

}
