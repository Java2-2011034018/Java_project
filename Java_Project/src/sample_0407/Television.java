package sample_0407;

public class Television {

	int channel;
	int volume;
	boolean onOff;

	void pr() {
		System.out.println("���� ������ " + onOff + ". �ڷ������� ä���� " + channel + "�̰� ������ " + volume + "�Դϴ�.");
	}
	
	int changeChannel(int ch){
		channel = ch;
		return channel;
	}

}
