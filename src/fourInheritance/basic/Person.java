package fourInheritance.basic;

public class Person {
	private String firstName;
	private String lastName;
	protected String email;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = firstName + lastName + "@ab.com";
	}

	public String getFullName() {
		return String.format("%s %s", this.firstName, this.lastName);
	}

	public String getEmail() {
		return this.email;
	}
}
