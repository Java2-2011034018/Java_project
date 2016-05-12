package sample_0512;

public class Rectangle extends Shape {
	
	private int i, j;
	
	public Rectangle(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	public void move (int i, int j){
		this.i += i;
		this.j += j;
	}
	
	public void info(){
		System.out.println("Rectangle i : " + this.i + " j : " + this.j);
	}
	
	public void iii(){
		System.out.println("i : " + this.i + " j : " + this.j);
	}

}
