package sample_0428;

public class CarTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("S600", "White", 80);
		Car c2 = new Car("E500", "blue", 20);
		
		int n = Car.getNumbers();  // c1.getNumbers 나 c2.getNumbers 라고 하지 않고 Car.getNumbers 로 사용!! (정적변수기 때문) 
		
		System.out.println("지금까지 생성된 자동차 수 = " + n);

	}

}