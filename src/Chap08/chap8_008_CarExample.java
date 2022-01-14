package Chap08;					// 필드 다형성 테스트

public class chap8_008_CarExample {

	public static void main(String[] args) {
		chap8_008_Car myCar = new chap8_008_Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new chap8_008_KumhoTire();
		myCar.frontRightTire = new chap8_008_KumhoTire();
		
		myCar.run();

	}

}
