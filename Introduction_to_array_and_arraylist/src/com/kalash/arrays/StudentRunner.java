package com.kalash.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 99, 98, 100 };
		Student student = new Student("Kalash", marks);
//      Variable arguments(these should be the last argument inside a method)
//		Student student = new Student("Kalash", 97,98,99,100);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);

		int sum = student.getTotalOfMarks();
		System.out.println("Sum of marks : " + sum);

		int maxMark = student.getMaxOfMarks();
		System.out.println("Maximum of marks : " + maxMark);

		int minMark = student.getMinOfMarks();
		System.out.println("Minimum of marks : " + minMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average of marks : " + average);

		System.out.println(student);
		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(1);
		System.out.println(student);
	}

}
