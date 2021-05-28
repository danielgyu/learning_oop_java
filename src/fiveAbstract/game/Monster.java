package fiveAbstract.game;

public abstract class Monster {
	private int hp;
	private int attack;
	private int defense;
	
	public Monster(int hp, int attack, int defense) {
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

	public int getHp() {
		return this.hp;
	}

	public int getAttack() {
		return this.attack;
	}
	
	public int getDefense() {
		return this.defense;
	}

	public final boolean isAlive() {
		return this.hp > 0;
	}

	public final void attack(Monster monster) {
		int damage = this.calculateDamage(monster);
		monster.hp = Math.max(0, monster.hp - damage);
	}

	public abstract int calculateDamage(Monster monster);

}
