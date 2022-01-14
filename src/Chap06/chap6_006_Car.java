package Chap06;					// 생성자의 오버로딩

public class chap6_006_Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	chap6_006_Car() {					// 생성자 1번
	}
	
	chap6_006_Car(String model) {		// 생성자 2번
		this.model = model;
	}
	
	chap6_006_Car(String model, String color) {					// 생성자 3번
		this.model = model;
		this.color = color;
	}
	
	chap6_006_Car(String model, String color, int maxSpeed) {	// 생성자 4번
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
