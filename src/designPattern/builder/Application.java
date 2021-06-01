package designPattern.builder;

public class Application {
	public static void main(String[] argv) {
		Employee robert = new EmployeeBuilder(1)
			.withAge(31)
			.withStartingYear(2020)
			.withName("Robert", "Lee")
			.build();
		robert.introduce();
	}
}
