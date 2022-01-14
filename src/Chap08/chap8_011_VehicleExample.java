package Chap08;					// 강제 타입 변환

public class chap8_011_VehicleExample {

	public static void main(String[] args) {
		chap8_011_Vehicle vehicle = new chap8_011_Bus();
		
		vehicle.run();
		//vehicle.checkFare();		// Vehicle 인터페이스에는 checkFare()가 없음
		
		chap8_011_Bus bus = (chap8_011_Bus) vehicle;	// 강제 타입 변환
		
		bus.run();
		bus.checkFare();		// Bus 클래스에는 checkFare()가 있음

	}

}
