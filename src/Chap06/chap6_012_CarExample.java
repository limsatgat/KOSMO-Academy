package Chap06;					// Ŭ���� �ܺο��� �޼ҵ� ȣ��

public class chap6_012_CarExample {

	public static void main(String[] args) {
		chap6_012_Car myCar = new chap6_012_Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ�: " + speed + "km/h");

	}

}
