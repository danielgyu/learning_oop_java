package designPattern.factory;

public final class PaperCup extends ProCup {
	private Lid lid;

	PaperCup(int sizeMl, Lid lid) {
		super(sizeMl);
		this.lid = lid;
	}
}
