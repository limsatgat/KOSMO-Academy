package Chap09;					// �͸� ���� ��ü ����	// �͸� ���� Ŭ������ ��ü ����

public class chap9_009_AnonymousExample {

	public static void main(String[] args) {
		chap9_009_Anonymous anony = new chap9_009_Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new chap9_009_RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV�� �մϴ�.");
					}
					@Override
					public void turnOff() {
						System.out.println("SmartTV�� ���ϴ�.");
					}
				}
				);

	}

}
