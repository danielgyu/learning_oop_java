package twoJavaClass.hismayfly;


public class Human {
	public int age;
	public String name;

	public void walk() {
		this.age += 1;
	}

	public void eat() {
		this.age -=1;
	}

	public void speak() {
		System.out.println("Hello!");
	}
}
