package Homework;

public class MyCounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCounter count = new MyCounter();
		int x = 10;
		
		count.inc(x);
		System.out.println("x = " + x); // ���� ���� -> ���� �����ؼ� ������
		
		System.out.println("count.value = " + count.value);
		count.inc(count); // ��ü ����
		System.out.println("count.value = " + count.value);
		
		int[] list = {1, 2, 3, 4, 5};
		
		count.inc(list);
		
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}

	}

}
