package loops;

public class SumOfNumberUptoNRunner {

	public static void main(String[] args) {
		SumOfNumber number = new SumOfNumber(6);
		int sum = number.sumUptoN();
		System.out.println("SumUptoN " + sum);
	}

}
