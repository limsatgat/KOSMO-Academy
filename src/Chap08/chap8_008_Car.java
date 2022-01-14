package Chap08;					// 필드 다형성

public class chap8_008_Car {
	chap8_008_Tire frontLeftTire = new chap8_008_HankookTire();
	chap8_008_Tire frontRightTire = new chap8_008_HankookTire();
	chap8_008_Tire backLeftTire = new chap8_008_HankookTire();
	chap8_008_Tire backRightTire = new chap8_008_HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
