package Chap08;					// ����Ʈ �޼ҵ� ���

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
