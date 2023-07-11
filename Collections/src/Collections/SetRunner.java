package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// unique-->Set
		// Tree-->Ascending Order
		// Hash-->Random Order
		// LinkedHash-->insertion order

		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("TreeSet " + treeSet);

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedHashSet " + linkedHashSet);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet " + hashSet);

	}

}
