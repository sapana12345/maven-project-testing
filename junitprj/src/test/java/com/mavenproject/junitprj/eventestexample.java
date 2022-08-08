package com.mavenproject.junitprj;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class eventestexample {
public boolean isevenNumber(int number) {
	boolean result=false;
	if(number%2==0) {
		return true;
	}
	return false;
}


@Test
public void eventest() {
	eventestexample es=new eventestexample();
	assertTrue(es.isevenNumber(4));
}
}
