package com.demo.Service;

import com.demo.dao.SomeDataService;

public class Service {
	private SomeDataService somedataservice;

	public void setSomedataservice(SomeDataService somedataservice) {
		this.somedataservice = somedataservice;
	}
	public int calculateSumData() {
		int[] data=somedataservice.retriveAllData();
		int sum=0;
		for(int i:data) {
			sum+=i;
		}
		return sum;
		
	}

}
