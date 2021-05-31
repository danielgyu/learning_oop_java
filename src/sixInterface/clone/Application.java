package sixInterface.clone;

public class Application {

	public static void main(String[] argv) {

		// using copy constructor
		Robot robot = new Robot(300);
		Robot other = new Robot(robot);
		System.out.println(robot == other);

		// using object clone
		try {
			Robot robotOriginal = new Robot(200);
			Robot robotClone = (Robot) robotOriginal.clone();
			System.out.println(robotOriginal == robotClone);
		} catch (CloneNotSupportedException c) {}


	} 
}
