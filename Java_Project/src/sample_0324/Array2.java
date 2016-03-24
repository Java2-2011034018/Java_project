package sample_0324;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[2][4];
		
		for(int i=0, r=1 ; i<2 ; i++){
			for(int j=0 ; j<4 ; j++, r++){
				array[i][j] = r;  //i*4+j+1
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		int[] array2 = {1, 3, 5, 10, 6, 7};
		for(int x : array2){ //최근 방식
			System.out.println("xxxxx"+x);
		}
	}

}