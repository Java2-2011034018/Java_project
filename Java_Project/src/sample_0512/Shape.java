package sample_0512;

abstract public class Shape {

	protected int x, y;

	public Shape() {
		x = 0;
		y = 0;
	}

	public Shape(int _x, int _y) {
		x = _x;
		this.y = _y;
	}

	abstract public void move(int _x, int _y);// { //Shape의 move는 사용하지 않고 abstract를 써서 Rectangle 과 Circle의 연관성만 유지
	//	this.x += _x;
	//	y += _y;
	//}
	
	abstract public void info(); // abstract로 info를 오버라이딩 해줘야 ShapeTest에서 다형성이 돌아간다.
	
	abstract public void iii();

}
