package com.kalash.OOPS.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("JUMP");
	}

	@Override
	public void down() {
		System.out.println("Goes into a hole");
	}

	@Override
	public void left() {
		System.out.println("Come out of hole");
	}

	@Override
	public void right() {
		System.out.println("Go Forward");
	}

}
