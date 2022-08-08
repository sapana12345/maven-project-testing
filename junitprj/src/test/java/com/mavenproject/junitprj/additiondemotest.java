package com.mavenproject.junitprj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class additiondemotest {
public static int add(int a,int b) {
	int add=a+b;
	return add;
}
@Test
public void addTest() {
	//additiondemotest additiondemotest;
int result =additiondemo.add(30,50);
System.out.println("addtion tset: "+result);
assertEquals(80,result);

}
@Test
	public void subTest() {
		//additiondemotest additiondemotest;
	int result =additiondemo.sub(30,50);
	System.out.println("substrcation tset: "+result);
	assertEquals(30,result);
	
	}
@Test
		public void mulTest()
		{
	int result =additiondemo.mul(30,50);
	System.out.println("multiplication tset: "+result);
	assertEquals(1500,result);
			//additiondemotest additiondemotest;
			
}
}
