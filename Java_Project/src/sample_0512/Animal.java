package sample_0512;

public class Animal {

	protected double weight;
	protected String picture;

	public Animal() {
		weight = 99;
		picture = "Animal";
		System.out.println("Animal Cont");
	}
	

	public Animal(double weight, String picture) {
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal Cont2");
	}


	void eat() {
		System.out.println("eat()�� ȣ��Ǿ���");
	}

	void sleep() {
		System.out.println("sleep()�� ȣ��Ǿ���");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
