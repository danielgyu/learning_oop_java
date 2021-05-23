package fourInheritance.basic;

public class Student extends Person{
	private String major;

	public Student(String firstName, String lastName, String major) {
		super(firstName, lastName);
		this.major = major;
	}

	public String getMajor() {
		return this.major;
	}
}
