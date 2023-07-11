
package com.kalash.concurrency;

public class Synhronized {

	private int i = 0;

	synchronized public void increment() {
		//get i
		//increment
		//set i
		i++;
	}

	public int getI() {
		return i;
	}
}
