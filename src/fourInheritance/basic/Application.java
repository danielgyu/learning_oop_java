package fourInheritance.basic;

public class Application {
	
	public static void main(String[] argv) {

		Person p = new Person("kg", "lee");
		System.out.println("Person:::");
		System.out.println(p.getFullName());

		Student s = new Student("english", "kg", "lee");
		System.out.println("Student:::");
		System.out.println(s.getFullName());
		System.out.println(s.getMajor());

		System.out.println("Email:::");
		System.out.println(s.getEmail());
	}
}
