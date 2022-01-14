package Chap08;					// 디폴트 메소드 사용

public class chap8_006_RemoteControlExample {

	public static void main(String[] args) {
		chap8_001_RemoteControl rc = null;
		
		rc = new chap8_001_Television();
		rc.turnOn();
		rc.setMute(true);

		rc = new chap8_001_Audio();
		rc.turnOn();
		rc.setMute(true);
	}

}
