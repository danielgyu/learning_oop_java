package threeJavaModeling.hismayfly;

public class Singleton {
	private static Singleton instance;

	private void Singleton() {
	}

	public static Singleton getInstance() {
		if (Singleton.instance == null) {
			Singleton.instance = new Singleton();
		}
		return Singleton.instance;
	}
}
