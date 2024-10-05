package com.java.SpringAnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

 public void show() {
	 System.out.println("Bike is Running");
 }
}
