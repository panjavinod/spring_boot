package com.cp.Constructor_Injection;

public class Test {
String ProductName;

public Test(String ProductName) {
	this.ProductName=ProductName;
}
public void display() {
	System.out.println(ProductName+" 150Rupees");
}
}
