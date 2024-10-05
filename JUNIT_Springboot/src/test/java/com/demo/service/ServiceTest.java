package com.demo.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.demo.Service.Service;
import com.demo.dao.SomeDataService;
class SomeDataServiceimpl implements SomeDataService{

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4};
	}
	
}
class SomeDataServiceimpl_Zero implements SomeDataService{

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {};
	}
	
}
class SomeDataServiceimpl_One implements SomeDataService{

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1};
	}
	
}


public class ServiceTest {
	
	@Test
	void calculateSumData() {
		Service service=new Service();
		service.setSomedataservice(new SomeDataServiceimpl());
		int actualOutPut=service.calculateSumData();
		int ExpectedOutPut=10;
		assertEquals(ExpectedOutPut,actualOutPut);
	}
	@Test
	void calculateSumData_Zero() {
		Service service=new Service();
		service.setSomedataservice(new SomeDataServiceimpl_Zero());
		int actualOutPut=service.calculateSumData();
		int ExpectedOutPut=0;
		assertEquals(ExpectedOutPut,actualOutPut);
	}
	@Test
	void calculateSumData_One() {
		Service service=new Service();
		service.setSomedataservice(new SomeDataServiceimpl_One());
		int actualOutPut=service.calculateSumData();
		int ExpectedOutPut=1;
		assertEquals(ExpectedOutPut,actualOutPut);
	}

}
