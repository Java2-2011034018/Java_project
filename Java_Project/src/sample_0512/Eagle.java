package sample_0512;

public class Eagle extends Animal {

	private int wings = 2;

	public Eagle() {
		System.out.println("Eagle Cont");
	}

	void fly() {
		System.out.println("fly()가 호출되었음");
	}

	void eat() {
		System.out.println("Eagle eat");
	}
}
