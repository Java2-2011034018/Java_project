package sample_0512;

public class Lion extends Animal {

	private int legs;

	public Lion() {
		super(100, "KING");  // 인자 2개 받는 Animal(부모) 생성자를 불러온다. 오버라이딩할 때 super 쓰면 부모의 메소드를 사용할 수 있다.
		this.legs = 4;
	}

	void roar() {
		System.out.println("roar()가 호출되었음");
	}

	void infor() {
		System.out.println(weight + " " + picture);
	}
}
