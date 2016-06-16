package final_test_sample;

public class ShapeTest { //상속, 생성자... 명시적호출 예제

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColoredRectangle obj = new ColoredRectangle(10, 10, 20, 20, "red");
		
		//ColoredRectangle의 생성자에서 Rectangle의 생성자가 먼저 실행되고 Rectangle의 생성자에서 Shape 생성자가 먼저 실행됨.
		
		//따라서 Shape - Rectangle - ColoredRectangle 순으로 생성자가 실행됨.

	}

}
