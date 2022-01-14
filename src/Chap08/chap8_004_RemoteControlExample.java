package Chap08;					// 인터페이스 사용

public class chap8_004_RemoteControlExample {
	public static void main(String[] args) {
		
		chap8_001_RemoteControl rc = null;
		
		rc = new chap8_001_Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new chap8_001_Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
