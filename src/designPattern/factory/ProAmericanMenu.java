package designPattern.factory;

public class AmericanMenu extends Menu {
	@Override
	public Cup createOrNull(CupSize size) {
		Lid lid = new Lid(size)

		switch (size) {
			case SMALL:
				return new PaperCup(473, lid);
		}
	}
}
