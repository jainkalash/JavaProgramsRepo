package Collections;

import java.util.Stack;

public class StackRunner {

	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.pop();
		for (Integer temp : demo) {
			System.out.println(temp);
		}

		System.out.println(demo.peek());

		if (demo.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}

		System.out.println(demo.search(5)); // gives 1 or -1 only
	}

}
