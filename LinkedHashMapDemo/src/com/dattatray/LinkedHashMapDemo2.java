package com.dattatray;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHashMap= new LinkedHashMap<String,String>();
		linkedHashMap.put("ajay", "patil");
		linkedHashMap.put("sachin","deshmukh");
		linkedHashMap.put("dattatray","pawar");
		
		Set<String> s =linkedHashMap.keySet();
		for(String j :s) {
			System.out.println("key>>"+j);
			System.out.println("value>>"+ linkedHashMap.get(j));
		}
		
		
		
	}

}
