package com.eureka.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaUserMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaUserMsApplication.class, args);
	}

}
