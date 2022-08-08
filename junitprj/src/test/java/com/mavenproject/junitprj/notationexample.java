package com.mavenproject.junitprj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class notationexample {
	@BeforeClass
	public static void m12() {
		System.out.println("m1 using before class excuted before all test cases");
		
		

	}
	
	@Before
	public  void m2() {
		System.out.println("m1 using before class excuted before all test cases");
		//assetEquals(true,result);
		

	}
	@After
	public  void m3() {
		System.out.println("m1 using after excuted before all test cases");
		
		

	}
	@AfterClass
	
	
	public static void m4() {
		System.out.println("m1 using after class excuted before all test cases");
		
		

	}
	
	@Test(timeout=10)
	public  void test1() {
		System.out.println("test method uses");
		
		}
@Ignore
	
	
	public  void ignoremethod() {
		System.out.println("ignore method");
		
		

	}
	
	@Test
	public  void test2() {
		System.out.println("test case");
		//assetEquals(true,result);

	}

}
