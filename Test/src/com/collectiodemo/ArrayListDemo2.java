package com.collectiodemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al.add(40);
		al.add(50);
		al.add(60);
		
		al.addAll(al1);
		System.out.println(al);
		
		System.out.println(al1);
		
		
		
		
	}

}
