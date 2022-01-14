package Chap08;					// 익명 구현 클래스

public class chap8_003_RemoteControlExample {
	public static void main(String[] args) {
		chap8_003_RemoteControlExample rc = new chap8_003_RemoteControlExample()	{
			public void turnOn() { /*실행문*/}
			public void turnOff() { /*실행문*/}
			public void setVolume(int volume) { /*실행문*/}
		
		};
	}
}
