package Chap09;					// �͸�ü	//�͸��ڽ� ��ü ����

public class chap9_008_AnonymousExample {

	public static void main(String[] args) {
		chap9_008_Anonymous anony = new chap9_008_Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new chap9_008_Person()	{							// �Ű���
					void study()	{
						System.out.println("����Ļ��մϴ�.");
					}
					@Override
					void wake()	{
						System.out.println("18�ÿ� �����߽��ϴ�.");
						study();
					}
				}
				);
	}

}
