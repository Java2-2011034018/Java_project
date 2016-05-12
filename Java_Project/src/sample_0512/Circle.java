package sample_0512;

public class Circle extends Shape {
	
	private int r;
	
	public Circle(int r){
		this.r = r;
	}
	
	public void move(int x, int y){ //반지름도 적용된다.
		this.x = x + r;
		this.y = y + r;
	}
	
	public void info(){
		System.out.println("r : " + r);
	}
	
	public void iii() {
		System.out.println(this.r);
	}

}
