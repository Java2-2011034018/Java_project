package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;

	public void setMan(int man) {
		this.man = man;
	}

	public int getMan() {
		return man;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getTire() {
		return tire;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void all_setting(int tire, String color) {
		this.tire = tire;
		this.color = color;
	}

	public Car() {
		this(4, 3, "red");
	}

	public Car(int m, int t, String c) {
		this.man = m;
		this.tire = t;
		this.color = c;
	}

	void pr() {
		System.out.println("man : " + man + " tire : " + tire + " color : " + color);
	}
}
