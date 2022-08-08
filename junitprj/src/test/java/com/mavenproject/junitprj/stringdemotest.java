package com.mavenproject.junitprj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class stringdemotest {
@Test
	public void stringTest1() {
		String str="are";
		boolean result=stringdemo.checkString(str);
		System.out.println("contain result is: "+result);
		assertEquals(true,result);
		
		
	}
@Test
public void stringTest2() {
	String str="hellow";
	boolean result=stringdemo.checkString(str);
	System.out.println("contain result is: "+result);
	assertEquals(true,result);
	
}
}
