package com.test;

public class Employee {

	private String firstName;
	private String lastName;
	private String age;
	private String city;
	
	public Employee(String firstName, String lastName, String age, String city) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", city=" + city + "]";
	}
	
	
}
