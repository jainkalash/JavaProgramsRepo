package com.kalash.OOPS.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("Kalash");
//		student.setEmail("kalashjain9557gmail.com");
//
//		Person person = new Person();
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person);

		Employee employee = new Employee("Kalash", "Programmer Analyst");
		// employee.setName("Kalash");
		employee.setEmail("kalashjain9557gmail.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployerGrade('A');
		employee.setTitle("Programmer Analyst");

		System.out.print(employee);
	}

}
