package com.mavenproject.junitprj;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.STRING;

import org.junit.Test;

public class assetnullexample {
public String getPropValue(final String key) {
	Map<String, String>appProps=new HashMap<String, String>();
	appProps.put("key1","value 1");
	appProps.put("key2","value 2");
	appProps.put("key3","value 3");

	return appProps.get(key);
	
}
@Test
public void test() {
	
	assetnullexample ms=new assetnullexample();
	
	assertNotNull(ms.getPropValue("key1"));
}
}
