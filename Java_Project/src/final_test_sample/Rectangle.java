package final_test_sample;

public class Rectangle extends Shape { //Shape�� �ڽ�Ŭ�������� ColoredRectangle�� �θ�Ŭ����
	
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height){
		super(x, y);
		System.out.println("Rectangle()");
		this.width = width;
		this.height = height;
		
	}
	
	double calcArea(){
		return width * height;
	}

}
