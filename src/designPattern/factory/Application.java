package designPattern.factory;

public class Application {
	public static void main(String[] argv) {

		// static
		final CupSize cupSize = CupSize.SMALL;
		final Cup cup = Cup.createOrNull(cupSize);
		System.out.println(cup.getSize());

		// poly 1
		Menu menu = new KoreanMenu();
		PolyCup polyCup = menu.createCupOrNull(CupSize.LARGE);
		System.out.println(polyCup.getSize());

		Menu americanMenu = new AmericanMenu();
		PolyCup polyCup2 = americanMenu.createCupOrNull(CupSize.LARGE);
		System.out.println(polyCup2.getSize());


	}
}
