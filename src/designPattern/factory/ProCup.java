package designPattern.factory;

public abstract class Cup {
	private int sizeMl;

	protected Cup(int sizeMl) {
		this.sizeMl = sizeMl;
	}

	public int getSize() {
		return this.sizeMl;
	}
}
