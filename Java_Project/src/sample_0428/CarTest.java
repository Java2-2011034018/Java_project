package sample_0428;

public class CarTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("S600", "White", 80);
		Car c2 = new Car("E500", "blue", 20);
		
		int n = Car.getNumbers();  // c1.getNumbers �� c2.getNumbers ��� ���� �ʰ� Car.getNumbers �� ���!! (���������� ����) 
		
		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);

	}

}