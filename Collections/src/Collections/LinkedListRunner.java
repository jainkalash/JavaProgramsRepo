package Collections;

import java.util.LinkedList;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		countries.add(1, "Canada");// index and then element
		countries.add("Bragil");
		countries.set(7, "Brazil");// modify the content
		countries.remove();// remove 1st element from list
		countries.remove(3);// remove particular indexed element from list
		new LinkedListRunner().printList(countries);

		System.out.println(countries);
	}

	void printList(LinkedList<String> list) {
		for (String element : list) {
			System.out.println("Element: " + element);
		}
		System.out.println("*******************");
	}

}
