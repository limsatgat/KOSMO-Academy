package Chap06;					// 클래스 외부에서 메소드 호출

public class chap6_012_CarExample {

	public static void main(String[] args) {
		chap6_012_Car myCar = new chap6_012_Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");

	}

}
