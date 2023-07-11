package generics;

import java.util.ArrayList;
import java.util.List;

class GenericData {
	public <E> void printListData(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
	}

	public <E> void printArrayData(E[] arrayData) {
		for (E element : arrayData) {
			System.out.println(element);
		}
	}
}
public class GenericMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		GenericData data = new GenericData();
		System.out.println("Printing String list");
		data.printListData(list);

		System.out.println("*******************");

		List<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		System.out.println("Printing Integer list");
		data.printListData(list2);

		System.out.println("********************");

		String[] stringArray = { "One", "Two", "Three" };
		System.out.println("Printing String array");
		data.printArrayData(stringArray);

		System.out.println("*********************");

		Integer[] integerArray = { 1, 2, 3, 4 };
		System.out.println("Printing Integer array");
		data.printArrayData(integerArray);

	}

}
