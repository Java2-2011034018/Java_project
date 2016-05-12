package Homework;

public class MyCounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCounter count = new MyCounter();
		int x = 10;
		
		count.inc(x);
		System.out.println("x = " + x); // 변수 전달 -> 값을 복사해서 보내줌
		
		System.out.println("count.value = " + count.value);
		count.inc(count); // 객체 전달
		System.out.println("count.value = " + count.value);
		
		int[] list = {1, 2, 3, 4, 5};
		
		count.inc(list);
		
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}

	}

}
