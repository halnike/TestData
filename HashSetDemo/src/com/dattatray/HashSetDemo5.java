package com.dattatray;

import java.util.HashSet;

public class HashSetDemo5 {

	public static void main(String[] args) {
		HashSet <String>hashSet = new HashSet<String>();
		hashSet.add("datta");
		hashSet.add("anna");
		hashSet.add("vitthal");
		
		for(String s: hashSet) {
			System.out.println(s);
		}
		
	}

}
