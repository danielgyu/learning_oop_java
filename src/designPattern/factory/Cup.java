package designPattern.factory;

public final class Cup {
	private int sizeMl;

	private Cup (int sizeMl) {
		this.sizeMl = sizeMl;
	}

	public int getSize() {
		return this.sizeMl;
	}

	public static Cup createOrNull(CupSize size) {
		switch(size) {

			case SMALL:
				return new Cup(355);
			case MEDIUM:
				return new Cup(473);
			case LARGE:
				return new Cup(651);
			default:
				assert (false) : "Unhandled CupSize";
				return null;
		}
	}
}
