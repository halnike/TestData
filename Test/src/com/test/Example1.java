package com.test;

import java.util.HashSet;

public class Example1 {

	public static void main(String[] args) {
		
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("one");
		hs1.add("two");
		hs1.add("three");
		
		System.out.println(hs1);
		
		System.out.println(hs);
		
		hs.addAll(hs1);
		// contains method and iterate
		System.out.println(hs);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
