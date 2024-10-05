package com.cg.JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
    Calculator c=new Calculator();
 //    Check Assert Equals Or Not
	@Test
	public void test() {
		assertEquals(5,c.add(2, 3));
	}
//  Check it is NotNull
	@Test
	public void test1() {
		assertNotNull(c.ADD("JAVA"));
	}
//  Check it is Null	
	@Test
	public void test2() {
		assertNull(c.add1(null));
	}
//	check its true
	@Test
	public void test3() {
		assertTrue(c.add2("java","java"));
	}
//	check its false
	@Test
	public void test4() {
		assertFalse(c.add2("java","jav"));
	}
	

}
