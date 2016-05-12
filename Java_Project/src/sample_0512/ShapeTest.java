package sample_0512;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle(5,6);
		Circle cir = new Circle(4);
		
		Shape rec1 = new Rectangle(3,4);//하면 Rectangle로 만들었지만 shape까지만 볼 수 있는 객체가 만들어진다.(shape까지만 볼 수 있지만 Rectangle이다.)
		Shape cir2 = new Circle(3); 
		Shape rec2 = new Rectangle(3,5);
		
		rec.move(111, 111);
		cir.move(999, 999);
		info(rec);
		info(cir); // 둘의 공통점 : Shape를 받았다.
		
		info(rec1); // Shape만 볼 수 있지만 Rectangle이다. Shape에 메소드 오버라이딩을 해놨으므로 Rectangle의 info가 돌아간다.
		info(cir2);
		info(rec2);

	}
	
	static void info(Rectangle r){ // static은 클래스에 종속되기 때문에 객체를 만들지 않아도 사용 가능.
		r.info();
	}
	
	static void info(Circle c){ // static은 static에서만 사용가능하다!! main이 static이므로 static을 사용해야 main에서 사용 가능하다.
		c.info();
	}
	
	static void info(Shape r) { r.info(); r.iii();} // 이게 돌아가려면 Shape에서 추상화(abstract)로 info를 만들어주면 다형성으로 인해 잘 돌아간다.
	                                       // 여기서 r은 shape가 아니라 연관성을 보고 따라올라가서 실행시켜준다.
	
	// 위 2개 static처럼 만들면 자식이 30개면 30개의 메소드를 만들어야 하지만 3번째처럼 하면 메소드 1개로 30개를 다 돌릴 수 있다.
	// 다형성을 쓰려면 함수 오버라이딩이 필수이다!!!!

}
