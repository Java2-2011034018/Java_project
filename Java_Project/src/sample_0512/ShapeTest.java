package sample_0512;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle(5,6);
		Circle cir = new Circle(4);
		
		Shape rec1 = new Rectangle(3,4);//�ϸ� Rectangle�� ��������� shape������ �� �� �ִ� ��ü�� ���������.(shape������ �� �� ������ Rectangle�̴�.)
		Shape cir2 = new Circle(3); 
		Shape rec2 = new Rectangle(3,5);
		
		rec.move(111, 111);
		cir.move(999, 999);
		info(rec);
		info(cir); // ���� ������ : Shape�� �޾Ҵ�.
		
		info(rec1); // Shape�� �� �� ������ Rectangle�̴�. Shape�� �޼ҵ� �������̵��� �س����Ƿ� Rectangle�� info�� ���ư���.
		info(cir2);
		info(rec2);

	}
	
	static void info(Rectangle r){ // static�� Ŭ������ ���ӵǱ� ������ ��ü�� ������ �ʾƵ� ��� ����.
		r.info();
	}
	
	static void info(Circle c){ // static�� static������ ��밡���ϴ�!! main�� static�̹Ƿ� static�� ����ؾ� main���� ��� �����ϴ�.
		c.info();
	}
	
	static void info(Shape r) { r.info(); r.iii();} // �̰� ���ư����� Shape���� �߻�ȭ(abstract)�� info�� ������ָ� ���������� ���� �� ���ư���.
	                                       // ���⼭ r�� shape�� �ƴ϶� �������� ���� ����ö󰡼� ��������ش�.
	
	// �� 2�� staticó�� ����� �ڽ��� 30���� 30���� �޼ҵ带 ������ ������ 3��°ó�� �ϸ� �޼ҵ� 1���� 30���� �� ���� �� �ִ�.
	// �������� ������ �Լ� �������̵��� �ʼ��̴�!!!!

}
