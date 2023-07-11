package com.kalash.OOPS;

public class ObjectCompositionBookRunner {

	public static void main(String[] args) {
		ObjectCompositionBook book = new ObjectCompositionBook(123, "Object Oriented Programming with Java",
				"Kalash");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));

		System.out.println(book);
	}

}
