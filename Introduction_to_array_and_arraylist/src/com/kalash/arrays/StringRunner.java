package com.kalash.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String daysWithMostCharacters = "";
		for (String day : daysOfWeek) {
			if (day.length() > daysWithMostCharacters.length()) {
				daysWithMostCharacters = day;
			}
		}
		System.out.println("Day with most no. of characters " + daysWithMostCharacters);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
