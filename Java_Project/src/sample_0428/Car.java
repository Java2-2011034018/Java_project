package sample_0428;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers = 0; //�������� ��� ����
	                        // static{ } : �������� �ʱ�ȭ 
	
	public Car(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers; // ������ ����Ǹ� numbers�� +1 ��.
	}
	
	public static int getNumbers(){
		return numbers; //
	}


}