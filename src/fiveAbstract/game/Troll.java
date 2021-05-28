package fiveAbstract.game;

public class Troll extends Monster{
	
	public Troll(int hp, int attack, int defense) {
		super(hp, attack, defense);
	}

	public int calculateDamage(Monster monster) {
		return this.getAttack() - monster.getDefense() / 2;
	}
}
