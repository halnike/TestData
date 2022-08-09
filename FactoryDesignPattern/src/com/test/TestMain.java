package com.test;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		try {
			String booking;
			System.out.println("Enter the type: first,second,third");
			Scanner scanner = new Scanner(System.in);
			String book = scanner.next();
			Booking b = BookingFactory.createBooking(book);
			System.out.println(b.getAcClass());
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
