package Chap08;					// �͸� ���� Ŭ����

public class chap8_003_RemoteControlExample {
	public static void main(String[] args) {
		chap8_003_RemoteControlExample rc = new chap8_003_RemoteControlExample()	{
			public void turnOn() { /*���๮*/}
			public void turnOff() { /*���๮*/}
			public void setVolume(int volume) { /*���๮*/}
		
		};
	}
}
