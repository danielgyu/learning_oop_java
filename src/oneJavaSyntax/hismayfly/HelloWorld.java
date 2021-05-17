package oneJavaSyntax.hismayfly;

import oneJavaSyntax.hismayfly.StudentManager;
import oneJavaSyntax.hismayfly.ForLoop;
import oneJavaSyntax.hismayfly.Vector;
import oneJavaSyntax.hismayfly.Array;
import oneJavaSyntax.hismayfly.EnumSubject;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World");

		System.out.println("StudentManager");
		new StudentManager();

		System.out.println("ForLoop");
		new ForLoop();

		System.out.println("Switch");
		String month = "March";
		switch (month) {

			case "January":
				System.out.println("Jan");
				break;

			case "March":
				System.out.println("Yes");
				break;

			default:
				System.out.println("No");
				break;
		}

		System.out.println("Vector");
		Vector v1 = new Vector(1.1f, 3.3f);
		System.out.println(v1);

		System.out.println("Array:");
		new Array();

		System.out.println("Enum:");
		Subject subject1 = EnumSubject;
		System.out.println(subject1.MATH);
	}
}
