package Chap06;					// �ٸ� �����ڸ� ȣ���ؼ� �ߺ� �ڵ� ���̱�

public class chap6_007_Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	chap6_007_Car() {
	}
	chap6_007_Car(String model) {
		this(model, "����", 250);									//ȣ��
	}
	chap6_007_Car(String model, String color) {
		this(model, color, 250);								//ȣ��
	}
	
	chap6_007_Car(String model, String color, int maxSpeed) {	//����
		this.model = model;				//���� ���� �ڵ�
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
