package com.kalash.OOPS.inheritance;

//If you don't extend anything then java automatically extends object 
//That's why when we create object of person class then all other methods like notify equals come automatically

public class Person {
	private String name;
	private String email;
	private String phoneNumber;

	public Person(String name) {
		super();
		this.name = name;
		System.out.println("Person Constructor");
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return name + "#" + email + "#" + phoneNumber;
	}

}
