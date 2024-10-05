package com.demo.Service;

import com.demo.dao.SomeDataLayer;

public class ServiceLayer {
	
	private SomeDataLayer somedatalayer;
	
	public void setSomedatalayer(SomeDataLayer somedatalayer) {
		this.somedatalayer = somedatalayer;
	}


	public int calculateSumData() {
		int[] data=somedatalayer.retriveAll();
		int sum=0;
		for(int i:data) {
			sum+=i;
		}
		return sum;
		
	}

}
