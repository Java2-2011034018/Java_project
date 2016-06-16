package sample_0526;

public interface OperateCar {
	
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);

}

// 인터페이스에서 defualt 메소드로 메소드 몸체 제공가능.(JDK8부터 가능)

// 인터페이스에 정적메소드 가능(JDK 8부터 가능)