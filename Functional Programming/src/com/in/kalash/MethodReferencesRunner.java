package com.in.kalash;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
				.map(s -> s.length())
				.forEach(s -> System.out.println(s));

		// These methods references a shortcut for above method
		/*
		 * List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s ->
		 * s.length()).forEach(System.out::println);
		 * 
		 * List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
		 * .forEach(MethodReferencesRunner::print);
		 * 
		 * List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
		 * .forEach(s -> MethodReferencesRunner.print(s));
		 * 
		 * List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream() .map(String::length)
		 * .forEach(s -> System.out.println(s));
		 */
		

	}

}
