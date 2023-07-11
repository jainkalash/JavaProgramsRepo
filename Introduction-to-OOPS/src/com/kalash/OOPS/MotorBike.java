package com.kalash.OOPS;

public class MotorBike {
	// state
	private int speed; // member variable

	// behavior

	void setSpeed(int speed) { // local variable
//		System.out.println(this.speed);  //0
//		System.out.println(speed);  //100
//		this.speed = speed;

		this.speed = speed;
		System.out.println(this.speed); // 100
		System.out.println(speed); // 100
	}

	int getSpeed() {
		return speed; // here speed is this.speed
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		if (this.speed - howMuch > 0) {
			this.speed = this.speed - howMuch;
		}

		// setSpeed(this.speed-howMuch); same as we use if condition
	}

	void start() {
		System.out.println("Bike started");
	}
}
