package designPattern.factory;

public final class PolyCup {
	private int sizeMl;

	PolyCup (int sizeMl) {
		this.sizeMl = sizeMl;
	}

	public int getSize() {
		return this.sizeMl;
	}
}
