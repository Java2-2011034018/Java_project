package sample_0317;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y = 9, result;
		result = x + y;
		System.out.println(result);

		x = 2;
		y = 2;

		result = x << y;
		System.out.println(result);

		Scanner input = new Scanner(System.in);
		System.out.println("a ют╥б го╩О");
		int a = input.nextInt();
		System.out.println("b ют╥б го╩О");
		int b = input.nextInt();

		result = a * b;
		System.out.println(result);

		input.close();

	}

}
