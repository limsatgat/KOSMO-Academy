package Chap07;					// Ÿ�̾ ��ǰ���� ������ Ŭ����

public class chap7_008_Car {
	//�ʵ�
	chap7_008_Tire frontLeftTire = new chap7_008_Tire("�տ���", 6);
	chap7_008_Tire frontRightTire = new chap7_008_Tire("�տ�����", 2);
	chap7_008_Tire backLeftTire = new chap7_008_Tire("�ڿ���", 3);
	chap7_008_Tire backRightTire = new chap7_008_Tire("�ڿ�����", 4);
	//������
	//�޼ҵ�
	int run()	{
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLeftTire.roll()==false) { stop(); return 3; }
		if(backRightTire.roll()==false) { stop(); return 4; }
		return 0;
	}
	
	void stop()	{
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
