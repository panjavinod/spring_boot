package com.techgeeknext.basicsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
// Make the below class to extend WebSecurityConfigurerAdapter
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter

{
	@Autowired
	private Authentication entryPoint;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		  http .authorizeRequests() 
		  		.anyRequest().authenticated()
				  // httpBasic authentication
		  		.and() .httpBasic()
		  		.and() .exceptionHandling().authenticationEntryPoint(entryPoint);
		        		        
		        
	}
}
