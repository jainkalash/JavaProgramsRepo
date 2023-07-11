package loops;

public class IsPrimeRunner {
	public static void main(String[] args) {
		IsPrime number = new IsPrime(3);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);
	}
}
