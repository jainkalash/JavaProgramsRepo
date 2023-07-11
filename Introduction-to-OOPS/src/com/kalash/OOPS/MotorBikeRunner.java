package com.kalash.OOPS;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);

//      Encapsulation advantages

//		int ducatiSpeed = ducati.getSpeed();
//		ducatiSpeed = ducatiSpeed + 100;
//		ducati.setSpeed(ducatiSpeed);
//
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

//		System.out.println(ducati.getSpeed());
//		honda.setSpeed(80);
//		System.out.println(honda.getSpeed());

//      if we give them value like this then it breaks encapsulation
//		as another class changes our data members so the way to
//		correct it is making them private in their original class

//		ducati.speed = 100;
//		honda.speed = 80;
//
//		// state of any object can be changed
//		ducati.speed = 20;
//		honda.speed = 0;
	}

}
