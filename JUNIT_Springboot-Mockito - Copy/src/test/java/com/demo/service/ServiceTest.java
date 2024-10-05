package com.demo.service;



import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.Service.ServiceLayer;
import com.demo.dao.SomeDataLayer;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
	
	@InjectMocks
	ServiceLayer service;
	@Mock
	SomeDataLayer somedatalayer;
	
	//@BeforeEach()
	public void before() {
		service.setSomedatalayer(somedatalayer);
	}
	
	@Test
	void calculateSumData() {
		when(somedatalayer.retriveAll()).thenReturn(new int[] {1,2,3,4});
		assertEquals(10,service.calculateSumData());		
	}
	@Test
	void calculateSumData_Zero() {
		when(somedatalayer.retriveAll()).thenReturn(new int[] {});
		assertEquals(0,service.calculateSumData());		
	}
	@Test
	void calculateSumData_One() {
		when(somedatalayer.retriveAll()).thenReturn(new int[] {5});
		assertEquals(5,service.calculateSumData());		
	}
	

}
