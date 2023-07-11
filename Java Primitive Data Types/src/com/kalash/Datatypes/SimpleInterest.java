package com.kalash.Datatypes;

import java.math.BigDecimal;

public class SimpleInterest {
	BigDecimal principal;
	BigDecimal rate;
	public SimpleInterest(String principal, String rate) {
		this.principal = new BigDecimal(principal);
		this.rate = new BigDecimal(rate).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int time) {
		// amount = principal + principal * rate * time;
		BigDecimal totalValue = principal.add(principal.multiply(rate).multiply(new BigDecimal(time)));
		return totalValue;
	}

}
