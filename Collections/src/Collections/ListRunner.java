package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");

		new ListRunner().printList(countries);

		List<String> demo = new ArrayList<>();
		demo.add("One");
		demo.add("Two");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		new ListRunner().printList(demo);

	}

	void printList(List<String> list) {
		for (String element : list) {
			System.out.println("Element: " + element);
		}
		System.out.println("*******************");
	}

}
