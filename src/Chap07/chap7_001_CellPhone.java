package Chap07;					// ��� // �θ�Ŭ����

public class chap7_001_CellPhone {
	//�ʵ�
	String model;
	String color;
	
	//������
	
	//�޼ҵ�
	void powerOn()	{ System.out.println("������ �մϴ�."); }
	void poweroff()	{ System.out.println("������ ���ϴ�."); }
	void bell()	{ System.out.println("���� �︳�ϴ�."); }
	void sendVoice(String message)	{ System.out.println("�ڱ�: " + message); }
	void receiveVoice(String message) { System.out.println("����: " + message); }
	void hangUp() { System.out.println("��ȭ�� �����ϴ�."); }
}


