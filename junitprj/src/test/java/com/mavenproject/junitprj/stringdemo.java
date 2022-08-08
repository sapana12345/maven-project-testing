package com.mavenproject.junitprj;

import static org.junit.Assert.assertEquals;

public class stringdemo {
	static boolean checkString1(String s) {
		// TODO Auto-generated method stub
		String s1="hi how are you";
		if(s1.contains(s)) {
			return true;
			
		}
		return false;
		
	}

	static boolean checkString(String s2) {
		// TODO Auto-generated method stub
		String s1="hellow";
		if(s1.contains(s2)) {
			return true;
			
		}
		return false;
		
	}

}

	