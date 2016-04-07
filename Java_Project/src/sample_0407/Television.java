package sample_0407;

public class Television {

	int channel;
	int volume;
	boolean onOff;

	void pr() {
		System.out.println("현재 전원은 " + onOff + ". 텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	
	int changeChannel(int ch){
		channel = ch;
		return channel;
	}

}
