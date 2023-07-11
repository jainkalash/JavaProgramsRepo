package com.in.kalash;

import java.util.List;

public class FPSumRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		/*numbers.stream()
		    .forEach(element -> System.out.println(element));*/

		int sum = fpSum(numbers);
		System.out.println(sum);

//		int sum = printSum(numbers);
//		System.out.println(sum);
	}

	private static int fpSum(List<Integer> numbers) {
//		return numbers.stream().reduce(0, (number1, number2) -> {
//			System.out.println(number1 + " " + number2);
//			return number1 + number2;
//		});
		
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);


	}

	private static int printSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; // Mutation
		}
		return sum;
	}

}
