package Chap09;					// 익명 구현 객체 생성	// 익명 구현 클래스와 객체 생성

public class chap9_009_AnonymousExample {

	public static void main(String[] args) {
		chap9_009_Anonymous anony = new chap9_009_Anonymous();
		//익명 객체 필드 사용
		anony.field.turnOn();
		//익명 객체 로컬 변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(
				new chap9_009_RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					@Override
					public void turnOff() {
						System.out.println("SmartTV를 끕니다.");
					}
				}
				);

	}

}
