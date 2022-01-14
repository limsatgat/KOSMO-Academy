package Chap08;					// 인터페이스 변수에 구현 객체 대입

public class chap8_001_RemoteControlExample {
	public static void main(String[] args)	{
		chap8_001_RemoteControl rc;
		rc = new chap8_001_Television();
		rc = new chap8_001_Audio();
	}
}
