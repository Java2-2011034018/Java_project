package sample_0317;

public class Idontknow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i <= 2; i++)
			for(int j = 1; j<=3; j++){
				System.out.print(i);
				System.out.println(j);
			}
		
		for(int b=1; b<=9; b++){
			for(int a = 2; a<=9; a++){
				System.out.print(a);
				System.out.print("*");
				System.out.print(b);
				System.out.print("=");
				System.out.print(a*b);
				System.out.print("  ");
			}
			System.out.println("");
		}
		
		for(int c = 8; c>=1; c--){
			for(int d = 1; d<=9; d++){
				System.out.print(c*1000+d);
				System.out.print("  ");
			}
			System.out.println("");
		}
		
	}

}
