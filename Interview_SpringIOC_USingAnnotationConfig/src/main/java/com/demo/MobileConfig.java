package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfig {
	
	@Bean
	public Colour getColour() {
		return new Colour();
	}
	
	@Bean
	public Mobiles getOnePlusObject(Colour getColour ) {
		return new OnePlus(getColour);
	}
	
	@Bean
	public Mobiles getIPhoneObject() {
		return new IPhone();
	}

}
