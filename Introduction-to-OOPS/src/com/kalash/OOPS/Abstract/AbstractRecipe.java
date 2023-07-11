package com.kalash.OOPS.Abstract;

// Abstract classes are used when we have to give only the structure and not the implementation of methods in it

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();

}
