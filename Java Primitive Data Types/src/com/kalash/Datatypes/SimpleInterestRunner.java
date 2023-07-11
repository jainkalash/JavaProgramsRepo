package com.kalash.Datatypes;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		SimpleInterest SI = new SimpleInterest("4500.00", "7.5");
		BigDecimal totalValue = SI.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
