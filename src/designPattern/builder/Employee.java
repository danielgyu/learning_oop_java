package designPattern.builder;

public class Employee {
	private int id;
	private int age;
	private int startingYear;
	private String lastName;
	private String firstName;

	Employee(int id, int age, int startingYear,
			String lastName, String firstName) {
		this.id = id;
		this.age = age;
		this.startingYear = startingYear;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public void introduce() {
		System.out.println(this.lastName + this.firstName);
	}
}
