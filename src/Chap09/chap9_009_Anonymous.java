package Chap09;					//�͸� ���� ��ü ���� // �͸� ���� Ŭ������ ��ü ����

public class chap9_009_Anonymous {
	//�ʵ� �ʱⰪ���� ����
	chap9_009_RemoteControl field = new chap9_009_RemoteControl() {
		@Override										//�ʵ� ����� �ʱⰪ ����
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�");
		}
	};
	
	void method1() {
		//���� ���������� ����
		chap9_009_RemoteControl localVar = new chap9_009_RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
		//���� ���� ���
		localVar.turnOn();
	}
	
	void method2(chap9_009_RemoteControl rc) {
		rc.turnOn();
	}
	
}
