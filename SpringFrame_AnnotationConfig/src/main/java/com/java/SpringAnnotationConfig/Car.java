package com.java.SpringAnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
 public void show() {
	 System.out.println("Car is Running");
 }
}
