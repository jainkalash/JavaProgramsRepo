package Collections;

import java.util.ArrayList;

//Wrapper class works on a single entity
class intWrapper {
	public int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

}
public class AutoBoxingAndUnboxing {

	public static void main(String[] args) {
//		ArrayList<int> studentNumbers=new ArrayList<>();
//		as ArrayList can only contain list of objects rather than primitive data types so we have to create wrapper for int
		/*
		 * here Integer is a wrapper class for int which gives error.................
		 * ArrayList<Integer>studentNumbers =new ArrayList<>(); //Wrapper Class Used
		 * studentNumbers.add(25); // AutoBoxing as conversion taking place
		 * automatically System.out.println(studentNumbers.get(0)); //UnBoxing
		 */

		// here intWrapper is a customized wrapper class for int
		ArrayList<intWrapper> studentNumbers = new ArrayList<>();
		// Converting primitive data to an object is known as boxing
		studentNumbers.add(new intWrapper(12));// Boxing

		// converting object to primitive data type is unBoxing
		System.out.println(studentNumbers.get(0).getIntValue());// UnBoxing
	}

}
