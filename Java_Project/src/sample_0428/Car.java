package sample_0428;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers = 0; //정적변수 사용 예제
	                        // static{ } : 정적변수 초기화 
	
	public Car(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers; // 생성자 실행되면 numbers가 +1 됨.
	}
	
	public static int getNumbers(){
		return numbers; //
	}


}