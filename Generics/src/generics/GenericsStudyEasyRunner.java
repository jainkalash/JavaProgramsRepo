package generics;

class Data {
	private Object obj;

	public Data(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}

}

class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}

}

public class GenericsStudyEasyRunner {

	public static void main(String[] args) {
		// Non Generic
		/*
		Data data = new Data("Some String");

		String variable = (String) data.getObj();
		System.out.println(variable);
        */

		GenericClass<String> genericData = new GenericClass<String>("Some Data");
		String data = genericData.getData();
		System.out.println(data);

	}

}
