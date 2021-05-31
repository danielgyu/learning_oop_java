package sixInterface.clone;

public final class Robot implements Cloneable {
	private int hp;

	public Robot(int hp) {
		this.hp = hp;
	}

	public Robot(final Robot other) {
		this(other.hp);
	}

	public void damage(int amount) {
		this.hp = Math.max(0, this.hp - amount);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
