package com.kalash.OOPS;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line1", "Hyderabad", "500035");
		Customer customer = new Customer("Kalash", homeAddress);

		Address workAddress = new Address("line1 for work", "Hyderabad", "500078");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
