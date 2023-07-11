package com.kalash.OOPS.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char employerGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployerGrade() {
		return employerGrade;
	}

	public void setEmployerGrade(char employerGrade) {
		this.employerGrade = employerGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "#" + title + "#" + employerName + "#" + employerGrade;
	}
}
