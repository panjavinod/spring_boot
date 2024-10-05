package com.example.demo2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JunitTest {
    @Autowired
	private JunitController Jcontroller;
    @Test
	void contextLoads() {
		assertThat(Jcontroller).isNotNull();
	}

}
