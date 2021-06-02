package exception.basic;

public class Application {
	public static void main(String[] argv) {

		try {
			System.out.println("Try");
		} catch (Exception e) {
			System.out.println("Catch exception");
		} finally {
			System.out.println("finally");
		}
	}
}
