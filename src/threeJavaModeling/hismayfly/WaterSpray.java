package threeJavaClass.hismayfly;

public class WaterSpray {
	private int waterAmount;
	private static final int CAPACITY = 200;
	
	public WaterSpray() {
		this.waterAmount = waterAmount;
	}

	public int getRemainingWater() {
		return this.waterAmount;
	}

	public void addWater(int amount) {
		this.waterAmount += amount;
		this.waterAmount = Math.min(this.waterAmount, CAPACITY);
	}

	public void spray() {
		this.waterAmount -= Math.min(this.waterAmount, 5);
	}

	public void fillUp() {
		this.waterAmount = CAPACITY;
	}
	
	public void sprayTo(FlowerPot pot) {
		int sprayAmount = Math.min(this.waterAmount, 5);
		pot.addWater(sprayAmount);

		this.waterAmount -= sprayAmount;
	}
}
