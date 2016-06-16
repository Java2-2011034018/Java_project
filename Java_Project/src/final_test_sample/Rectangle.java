package final_test_sample;

public class Rectangle extends Shape { //Shape의 자식클래스이자 ColoredRectangle의 부모클래스
	
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
