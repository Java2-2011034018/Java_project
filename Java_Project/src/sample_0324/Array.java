package sample_0324;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[10];// {10, 20, 30}; //0, 1, 2
		int[] array2 = {11, 3, 4, 5, 6, 8};
		//System.out.println(array[1]);
		for(int i=0; i<10; i++){
			array[i] = (i+1)*10;
			System.out.println((i+1)+" "+array[i]);
		}
		array2[0] = array2[2] + array2[4];
	}

}
