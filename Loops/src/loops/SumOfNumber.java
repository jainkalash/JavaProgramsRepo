package loops;

public class SumOfNumber {

	private int number;

	public SumOfNumber(int number) {
		this.number = number;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

}
