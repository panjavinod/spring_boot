package com.demo;

public class Employe {
	private int id;
	private String name;
	private Address address;
	
	
	
	public Employe(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}



	public void show() {
		System.out.println("IM CONSTRUCTOR INJECTION");
		System.out.println(address.toString());
	}
	
	

}
