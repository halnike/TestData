package com.dattatray;

import java.util.HashSet;

public class HashSetDemo7 {
//design method which return hashSet object
	
	public HashSet getHashSet() {
		HashSet hashSet = new HashSet();
		hashSet.add(25);
		hashSet.add(50);
		hashSet.add(75);
		return hashSet;
	}
	    public static void main(String []args) {
	    	HashSetDemo7 hashSetDemo7 = new HashSetDemo7();
	    	HashSet hs = hashSetDemo7.getHashSet();
	    	System.out.println(hs);
	    }
		
		
		
	}
	
	
	
	
	

