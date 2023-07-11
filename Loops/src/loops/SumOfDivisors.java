package loops;

public class SumOfDivisors {

	private int number;

	public SumOfDivisors(int number) {
		this.number = number;
	}

	public int sumofDivisors() {
		// except 1 and that no. all the divisors sum must be printed
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	

}
