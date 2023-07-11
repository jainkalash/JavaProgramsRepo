package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorRunner {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");

		IteratorRunner itr = new IteratorRunner();
		itr.printList(countries);
		System.out.println("******************");

		countries.sort(null);// Collections.sort(countries);
		itr.printList(countries);
		System.out.println("******************");

		Collections.reverse(countries);
		itr.printList(countries);

	}

	void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
