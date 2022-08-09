package com.dattatray;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hashSet=new HashSet(); //16
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(15);
		hashSet.add(25);
		hashSet.add(25);//duplicate not allowed
		hashSet.add("Sanket");
		hashSet.add(null);
		System.out.println(hashSet);
		
		
		
	}

}
