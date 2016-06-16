package sample_0512;

class Animal2{
	void sound(){
		System.out.println("Animal Ŭ������ sound()");
	}
}

class Dog extends Animal2{
	void sound(){
		System.out.println("�۸�");
	}
}

class Cat extends Animal2{
	void sound(){
		System.out.println("�߿�");
	}
}

public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal2 animal = new Animal2();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal2 obj;
		
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();

	}

}
