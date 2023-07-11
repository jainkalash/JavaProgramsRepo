package com.kalash.concurrency;

public class Counter {
	private int i = 0;

	public void increment() {
		// get i
		// increment
		// set i
		i++;
	}

	public int getI() {
		return i;
	}
}
