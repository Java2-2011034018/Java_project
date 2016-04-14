package sample_0414;

public class Television {

	private int channel;
	private int volume;
	private boolean onOff;

	Television() {
		this.channel = 10;
		this.volume = 10;
		this.onOff = true;
	}

	Television(int c, int v, boolean o) {
		this.channel = c;
		this.volume = v;
		this.onOff = o;
	}
	
	public Television(int channel, int volume) {
		this(channel, volume, true);
	}
	
	

	void print() {
		if (onOff == true)
			System.out.println("전원은 " + onOff + "이고 " + "채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
		else
			System.out.println("전원이 꺼져있습니다.");
	}

}
