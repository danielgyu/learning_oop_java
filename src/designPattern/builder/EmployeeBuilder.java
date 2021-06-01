package designPattern.builder;

public class EmployeeBuilder {
	private int id;
	private int age;
	private int startingYear;
	private String lastName;
	private String firstName;

	public EmployeeBuilder(int id) {
		this.id = id;
	}

	public EmployeeBuilder withAge(int age) {
		this.age = age;
		return this;
	}

	public EmployeeBuilder withStartingYear (int startingYear) {
		this.startingYear = startingYear;
		return this;
	}

	public EmployeeBuilder withName (String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		return this;
	}

	public Employee build() {
		return new Employee(
				this.id,
				this.age,
				this.startingYear,
				this.lastName,
				this.firstName);
	}
	
}
