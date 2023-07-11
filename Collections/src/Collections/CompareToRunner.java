package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
}

public class CompareToRunner {

	public static void main(String[] args) {

		List<Names> names = new LinkedList<>();
		names.add(new Names("Chaand"));
		names.add(new Names("Ed"));
		names.add(new Names("John"));
		names.add(new Names("Mia"));

		CompareToRunner com = new CompareToRunner();
		com.printList(names);

		Collections.sort(names);// based on length it sorts
		System.out.println("*******************");
		com.printList(names);
	}

	void printList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
