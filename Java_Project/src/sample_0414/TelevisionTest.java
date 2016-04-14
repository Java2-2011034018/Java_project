package sample_0414;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television myTv = new Television(7, 10, true);
		myTv.print();

		Television yourTv = new Television(11, 20, true);
		yourTv.print();

		Television offTv = new Television(9, 9, false);
		offTv.print();

		Television testTv = new Television();
		testTv.print();
		
		Television trueTv = new Television(23, 5);
		trueTv.print();

	}

}