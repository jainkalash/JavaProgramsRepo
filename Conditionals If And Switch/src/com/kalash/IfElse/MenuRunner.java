package com.kalash.IfElse;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// type obj=new type(argument);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter number 2: ");
		int number2 = scanner.nextInt();

		System.out.println("Choices Available are ");
		System.out.println("1-> Add ");
		System.out.println("2-> Subtract ");
		System.out.println("3-> Multiply ");
		System.out.println("4-> Divide ");

		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();

		System.out.println("Your choices are");
		System.out.println("Number1 " + number1);
		System.out.println("Number2 " + number2);
		System.out.println("Choice is " + choice);

		performOperationUsingSwitch(number1, number2, choice);
//		performOperationUsingNestedIfElse(number1, number2, choice);
	}

//	private static void performOperationUsingNestedIfElse(int number1, int number2, int choice) {
//		if (choice == 1) {
//			System.out.println("Result " + (number1 + number2));
//		}
//		else if (choice == 2) {
//			System.out.println("Result " + (number1 - number2));
//		}
//		else if (choice == 3) {
//			System.out.println("Result " + (number1 * number2));
//		}
//		else if (choice == 4) {
//			System.out.println("Result " + (number1 / number2));
//		}
//		else {
//			System.out.println("Invalid Choice");
//		}
//	}

	private static void performOperationUsingSwitch(int number1, int number2, int choice){
		switch(choice) {
		case 1:
			System.out.println("Result " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result " + (number1 * number2));
			break;
		case 4:
			System.out.println("Result " + (number1 / number2));
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
