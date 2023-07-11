package com.kalash.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	// private int[] marks; array
	private ArrayList<Integer> marks = new ArrayList<Integer>();

//	public Student(String name, int... marks) {   variable arguments

	public Student(String name, int[] marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
//		return marks.length;   this is for array
		return marks.size(); // this is for array list
	}

	public int getTotalOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaxOfMarks() {
//		FOR ARRAYS
//		int max = Integer.MIN_VALUE;
//		for (int mark : marks) {
//			if (mark > max) {
//				max = mark;
//			}
//		}
//		return max;

//		FOR ARRAYLISTS
		return Collections.max(marks);
	}

	public int getMinOfMarks() {
//		FOR ARRAYS

//		int min = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (mark < min) {
//				min = mark;
//			}
//		}
//		return min;

//		FOR ARRAYLISTS
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum=getTotalOfMarks();
		int number=getNumberOfMarks();
		BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		return avg;
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}
