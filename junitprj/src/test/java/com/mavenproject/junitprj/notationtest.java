package com.mavenproject.junitprj;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class notationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result result=JUnitCore.runClasses(notationexample.class);
for(Failure failure:result.getFailures()) {
	System.out.println(failure.toString());
	//assetEquals(true,result);

}
System.out.println(result.wasSuccessful());

	}

	//private static void assetEquals(boolean b, Result result) {
		// TODO Auto-generated method stub
		
	}

////}
