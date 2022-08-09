package com.dattatray;

import java.util.HashSet;

public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet<Integer>hashSet=new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		
		for(Integer i : hashSet) {
			System.out.println(i);
		}
		
		
		
		
	}

}
