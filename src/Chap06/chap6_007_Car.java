package Chap06;					// 다른 생성자를 호출해서 중복 코드 줄이기

public class chap6_007_Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	chap6_007_Car() {
	}
	chap6_007_Car(String model) {
		this(model, "은색", 250);									//호출
	}
	chap6_007_Car(String model, String color) {
		this(model, color, 250);								//호출
	}
	
	chap6_007_Car(String model, String color, int maxSpeed) {	//대입
		this.model = model;				//공통 실행 코드
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
