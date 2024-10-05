package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.demo.WebController")
public class WebAppClientData1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebAppClientData1Application.class, args);
	}

}
