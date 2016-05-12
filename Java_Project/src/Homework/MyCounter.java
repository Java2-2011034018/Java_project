package Homework;

public class MyCounter {
	
	int value = 0;
	
	void inc(int a){
		a = a + 1;
	}
	
	void inc(MyCounter mc){
		mc.value = mc.value + 1;
	}
	
	void inc(int[] array){
		for (int i = 0; i < array.length; i++){
			array[i] = array[i] + 1;
		}
	}
	

}
