package com.demo;

public class Address {
  private String state;
  private String city;
  private String country;
  
public Address(String state, String city, String country) {
	super();
	this.state = state;
	this.city = city;
	this.country = country;
}

@Override
public String toString() {
	return "state=" + state + ", city=" + city + ", country=" + country ;
}


  
  
}
