package loops;

public class PrintTriangle {

	private int number;

	public PrintTriangle(int number) {
		this.number = number;
	}

	public void PrintNumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
