package Chap08;					// ���� Ŭ����

public class chap8_001_Audio implements chap8_001_RemoteControl {
	//�ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	//setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if(volume>chap8_001_RemoteControl.MAX_VOLUME)	{
			this.volume = chap8_001_RemoteControl.MAX_VOLUME;
		} else if(volume<chap8_001_RemoteControl.MIN_VOLUME)	{
			this.volume = chap8_001_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + this.volume);
	}

	}

