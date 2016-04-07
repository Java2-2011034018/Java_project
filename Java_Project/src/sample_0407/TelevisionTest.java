package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television tv = new Television();
		tv.channel = 23;
		tv.volume = 9;
		tv.onOff = true;

		Television testTV = new Television();
		testTV = tv;
		testTV.channel = 536;

		tv.pr();

		Television tv2 = new Television();
		tv2.channel = 23;
		tv2.volume = 9;
		tv2.onOff = true;

		System.out.println("current channel : " + tv2.changeChannel(24));

		tv2.pr();

	}

}