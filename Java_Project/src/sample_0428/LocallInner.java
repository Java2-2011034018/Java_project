package sample_0428;

public class LocallInner {
	
	private int data = 30;
	
	void display() {
		final String msg = "������ �����Ͱ��� ";
		
		class Local {
			void printMsg(){
				System.out.println(msg + data);
			}
		}
		
		Local obj = new Local();
		obj.printMsg();
	}

}