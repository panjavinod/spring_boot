package com.eureka.account.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaAccountMngMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaAccountMngMsApplication.class, args);
	}

}
