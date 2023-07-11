package loops;

public class IsPrime {

	private int number;

	public IsPrime(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
