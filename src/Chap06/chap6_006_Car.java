package Chap06;					// �������� �����ε�

public class chap6_006_Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	chap6_006_Car() {					// ������ 1��
	}
	
	chap6_006_Car(String model) {		// ������ 2��
		this.model = model;
	}
	
	chap6_006_Car(String model, String color) {					// ������ 3��
		this.model = model;
		this.color = color;
	}
	
	chap6_006_Car(String model, String color, int maxSpeed) {	// ������ 4��
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
