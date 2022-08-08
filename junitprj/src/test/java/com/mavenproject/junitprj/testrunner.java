package com.mavenproject.junitprj;
//import org.mavenproject.runner.Result;
//import org.mavenproject.runner.JUnitCore;
//import org.mavenproject.runner.notification,Failure;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testrunner {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(additiondemotest.class);
		for(Failure failure:result.getFailures()) {
		System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());

	}

}
