package Chap08;					// 구현 클래스

public class chap8_001_Audio implements chap8_001_RemoteControl {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>chap8_001_RemoteControl.MAX_VOLUME)	{
			this.volume = chap8_001_RemoteControl.MAX_VOLUME;
		} else if(volume<chap8_001_RemoteControl.MIN_VOLUME)	{
			this.volume = chap8_001_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	}

