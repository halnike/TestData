package com.dattatray;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo3 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHashMap= new LinkedHashMap<String,String>();
		linkedHashMap.put("ajay", "patil");
		linkedHashMap.put("sachin","deshmukh");
		linkedHashMap.put("dattatray","pawar");
		
		//by using for each method
		linkedHashMap.forEach((k,v) -> System.out.println("key>>"+k+"  value>>"+v));
		
//		-> lymbda expression
		
	}

}
