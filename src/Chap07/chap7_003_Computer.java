package Chap07;					// 메소드 오버라이딩 // 자식 클래스

public class chap7_003_Computer extends chap7_003_Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}

