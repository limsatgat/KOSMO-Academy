package Chap08;					// ���� Ÿ�� ��ȯ

public class chap8_011_VehicleExample {

	public static void main(String[] args) {
		chap8_011_Vehicle vehicle = new chap8_011_Bus();
		
		vehicle.run();
		//vehicle.checkFare();		// Vehicle �������̽����� checkFare()�� ����
		
		chap8_011_Bus bus = (chap8_011_Bus) vehicle;	// ���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();		// Bus Ŭ�������� checkFare()�� ����

	}

}
