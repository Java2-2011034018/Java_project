package sample_0324;

public class Apt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 9; i > 0; i--) {
			for (int j = 1; j < 9; j++) {
				System.out.print(i * 100 + j + " ");
				if ((i >= 6) && (j >= 5)) {
					break;
				}
			}
			System.out.println(" ");
		}

	}

}