package designPattern.factory;

public final class KoreanMenu extends Menu {

	@Override
	public PolyCup createCupOrNull(CupSize size) {
		switch(size) {
			case SMALL:
				return new PolyCup(355);
			case MEDIUM:
				return new PolyCup(473);
			case LARGE:
				return new PolyCup(651);
			default:
				assert (false) : "Unhandled CupSize";
				return null;
		}
	}
}
