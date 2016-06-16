package final_test_sample;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl ac = new RemoteControl(){
			
			public void turnOn(){
				System.out.println("TV turnON()");
			}
			public void turnOff(){
				System.out.println("TV turnOff()");
			}
		};
		
		ac.turnOn();
		ac.turnOff();

	}

}
