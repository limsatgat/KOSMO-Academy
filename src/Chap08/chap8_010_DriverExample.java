package Chap08;					// �Ű� ������ ������ �׽�Ʈ

public class chap8_010_DriverExample {

	public static void main(String[] args) {
		chap8_010_Driver driver = new chap8_010_Driver();
		
		chap8_010_Bus bus = new chap8_010_Bus();
		chap8_010_Taxi taxi = new chap8_010_Taxi();
		
		
		driver.drive(bus);				// �ڵ� Ÿ�� ��ȯ: Vehicle vehicle = bus;
		driver.drive(taxi);				// �ڵ� Ÿ�� ��ȯ: Vehicle vehicle = taxi;

	}

}
