package Chap07;					// 추상 메소드 선언

public abstract class chap7_014_Animal {		// 추상클래스
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();		// 추상 메소드
}
