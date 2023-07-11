package generics;

//Using comparable interface we can override compare to method
class ComparableInterface<T extends Comparable> implements Comparable<T> {
	private T myVariable;

	public ComparableInterface(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Comparable [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T o) {
		return getMyVariable().compareTo(o);
		// to reverse the order
		// return o.compareTo(getMyVariable());
	}

}

public class ComparableRunner {

	public static void main(String[] args) {
		ComparableInterface<Integer> data = new ComparableInterface<Integer>(1);// part1
		System.out.println(data.compareTo(2));// part2
		// If part1==part2 output=0
		// if part1<part2 output=-1
		// if part1>part2 output=1
	}

}
