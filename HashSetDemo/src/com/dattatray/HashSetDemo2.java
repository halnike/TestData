package com.dattatray;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet hashSet=new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add("pune");
		hashSet.add("mumbai");
		
		for(Object o : hashSet)
		{
			System.out.println(o);
		}
		
		
	}

}
