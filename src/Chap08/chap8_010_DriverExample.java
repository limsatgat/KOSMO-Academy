package Chap08;					// 매개 변수의 다형성 테스트

public class chap8_010_DriverExample {

	public static void main(String[] args) {
		chap8_010_Driver driver = new chap8_010_Driver();
		
		chap8_010_Bus bus = new chap8_010_Bus();
		chap8_010_Taxi taxi = new chap8_010_Taxi();
		
		
		driver.drive(bus);				// 자동 타입 변환: Vehicle vehicle = bus;
		driver.drive(taxi);				// 자동 타입 변환: Vehicle vehicle = taxi;

	}

}
