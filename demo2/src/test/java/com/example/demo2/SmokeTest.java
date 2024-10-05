package com.example.demo2;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {
    @Autowired
	private LController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
