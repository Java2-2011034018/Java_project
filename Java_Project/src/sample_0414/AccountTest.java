package sample_0414;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		obj.setRegNumber(123456);
		System.out.println(
				"��Ϲ�ȣ�� " + obj.getRegNumber() + " �̸��� " + obj.getName() + " ���� �ܰ�� " + obj.getBalance() + "�Դϴ�.");

	}

}
