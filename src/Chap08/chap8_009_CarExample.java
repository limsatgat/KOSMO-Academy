package Chap08;					// �ʵ� ������ �׽�Ʈ

public class chap8_009_CarExample {
	public static void main(String[] args) {
		chap8_009_Car myCar = new chap8_009_Car();
		
		myCar.run();
		
		myCar.tires[0] = new chap8_008_KumhoTire();
		myCar.tires[1] = new chap8_008_KumhoTire();
		
		myCar.run();
	}
}
