package designPattern.factory;

public final class AmericanMenu extends Menu {
	
	@Override
	public PolyCup createCupOrNull(CupSize size) {
		switch(size) {
			case SMALL:
				return new PolyCup(473);
			case MEDIUM:
				return new PolyCup(621);
			case LARGE:
				return new PolyCup(887);
			default:
				assert (false) : "Unhandled CupSize";
				return null;
		}
	}
}
