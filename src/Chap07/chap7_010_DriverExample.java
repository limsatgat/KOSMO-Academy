package Chap07;					// 매개 변수의 다형성 // 실행클래스

public class chap7_010_DriverExample {

	public static void main(String[] args) {
		chap7_010_Driver chap7_010_Driver = new chap7_010_Driver();
		
		chap7_010_Bus chap7_010_Bus = new chap7_010_Bus();
		chap7_010_Taxi chap7_010_Taxi = new chap7_010_Taxi();
		
		chap7_010_Driver.drive(chap7_010_Bus);
		chap7_010_Driver.drive(chap7_010_Taxi);

	}

	
}
