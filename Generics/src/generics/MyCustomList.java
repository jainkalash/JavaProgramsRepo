package generics;

import java.util.ArrayList;

public class MyCustomList<T> {

	// If we want to restrict the type of generic then we extends it like
	// public class MyCustomerList<T extends Number>
	// After this we can only use all data types which are included in Number class

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		return list.get(index);
	}
}
