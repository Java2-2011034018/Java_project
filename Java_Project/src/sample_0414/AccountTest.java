package sample_0414;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		obj.setRegNumber(123456);
		System.out.println(
				"등록번호는 " + obj.getRegNumber() + " 이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");

	}

}
