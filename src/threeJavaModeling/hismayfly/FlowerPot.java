package threeJavaModeling.hismayfly;

public class FlowerPot {
	private boolean alive;
	private final int minDailyWaterInMl;
	private int dailyWaterReceived;

	public FlowerPot (int minDailyWater) {
		this.alive = true;
		this.minDailyWaterInMl = minDailyWater;
	}

	public boolean isAlive() {
		return this.alive;
	}

	public int getMinDailyWater() {
		return this.minDailyWaterInMl;
	}

	public void addWater(int amount) {
		dailyWaterReceived += amount;
	}

	public void liveAnotherDay() {
		if (this.dailyWaterReceived < this.minDailyWaterInMl) {
			this.alive = false;
		}
		this.dailyWaterReceived = 0;
	}
}
