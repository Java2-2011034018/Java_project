package sample_0324;

public class Break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<5 ; i++){
			System.out.println("first : "+i);
			if(i==2){
				continue;
			}
			System.out.println("second : "+i);
			if(i==3){
				break;
			}
		}

	}

}
