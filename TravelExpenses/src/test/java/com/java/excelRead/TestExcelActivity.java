package com.java.excelRead;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestExcelActivity {
	ExcelActivity e=new ExcelActivity();
	
	@Test
	public void testCase_one() {
		assertNotNull(e.validate("C:\\Users\\pvinod\\eclipse-workspace\\TravelExpenses.xlsx"));
	}
	@Test
	public void testCase_two() {
		
		assertNotNull(e.validateOne("C:\\Users\\pvinod\\eclipse-workspace\\TravelExpenses.xlsx"));
	}
	@Test
	public void testCase_three() {
		
		assertNotNull(e.validateTwo("C:\\Users\\pvinod\\eclipse-workspace\\TravelExpenses.xlsx"));
	}
   
}
