package sample_0512;

public class Lion extends Animal {

	private int legs;

	public Lion() {
		super(100, "KING");  // ���� 2�� �޴� Animal(�θ�) �����ڸ� �ҷ��´�. �������̵��� �� super ���� �θ��� �޼ҵ带 ����� �� �ִ�.
		this.legs = 4;
	}

	void roar() {
		System.out.println("roar()�� ȣ��Ǿ���");
	}

	void infor() {
		System.out.println(weight + " " + picture);
	}
}
