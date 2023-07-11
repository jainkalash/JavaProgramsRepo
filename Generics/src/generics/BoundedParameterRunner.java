package generics;

class BoundedParameter<K extends Integer, V extends BoundedParameterRunner> {
	private K key;
	private V value;

	public BoundedParameter(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "BoundedParameter [key=" + key + ", value=" + value + "]";
	}

	public <E extends Character, N extends Number> void display(E element, N number) {
		System.out.println("Element: " + element + " Number: " + number);
	}

}

public class BoundedParameterRunner {

	public static void main(String[] args) {
		BoundedParameter<Integer, BoundedParameterRunner> data = new BoundedParameter<Integer, BoundedParameterRunner>(
				1, new BoundedParameterRunner());
		data.display('$', 1.0f);
		data.getValue().test();
		System.out.println(data.getKey());
	}

	public void test() {
		System.out.println("Testing...");
	}

}
