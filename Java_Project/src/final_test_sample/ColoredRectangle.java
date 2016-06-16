package final_test_sample;

public class ColoredRectangle extends Rectangle {
	
	String color;
	
	public ColoredRectangle(int x, int y, int width, int height, String color){
		
		super(x, y, width, height);
		System.out.println("ColoredRectangle()");
		this.color = color;
		
	}

}
