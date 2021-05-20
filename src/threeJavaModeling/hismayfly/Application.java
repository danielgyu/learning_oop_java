package threeJavaClass.hismayfly;

public class Application {
	
	public static void main(String[] argv) {

		WaterSpray ws = new WaterSpray();
		ws.fillUp();

		FlowerPot pot = new FlowerPot(10);

		for (int i = 0; i < 2; ++i) {
			//int water = ws.getRemainingWater();
			//ws.spray();
			//water -= ws.getRemainingWater();
			//pot.addWater(water);
			
			ws.sprayTo(pot);
		}

		pot.liveAnotherDay();

		System.out.println("pot allive? " + pot.isAlive());
	}
}
