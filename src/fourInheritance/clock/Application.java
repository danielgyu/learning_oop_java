package fourInheritance.clock;

public class Application{

	public static void main(String[] argv) {

		System.out.println("setTime:::");
		Clock clock = new Clock();
		clock.setTime((byte) -15, (byte) 104, (byte) -88);
		System.out.printf("%d:%d:%d", clock.getHours(), clock.getMinutes(), clock.getSeconds());
		System.out.println("");

		System.out.println("addSeconds:::");
		clock.addSeconds((short) 10800);
		System.out.printf("%d:%d:%d", clock.getHours(), clock.getMinutes(), clock.getSeconds());
	}
}
