package Chap06;					// �ܺ� Ŭ�������� Car �ʵ尪 �б�� ����

public class chap6_002_CarExample {

	public static void main(String[] args) {
		//��ü ����
		chap6_002_Car myCar = new chap6_002_Car();

		//�ʵ尪 �б�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
		
	}

}
