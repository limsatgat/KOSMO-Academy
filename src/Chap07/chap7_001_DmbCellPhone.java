package Chap07;					// ��� // �ڽ�Ŭ����

public class chap7_001_DmbCellPhone extends chap7_001_CellPhone {
	//�ʵ�
	int channel;
	
	//������
	chap7_001_DmbCellPhone(String model, String color, int channel) {
	
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}