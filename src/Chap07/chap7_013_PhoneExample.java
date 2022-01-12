package Chap07;					// 추상 클래스

public class chap7_013_PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		chap7_013_SmartPhone smartPhone = new chap7_013_SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

	
}
