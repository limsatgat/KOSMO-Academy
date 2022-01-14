package Chap08;					// 디폴트 메소드 // 새로운 구현 클래스

public class chap8_014_MyClassB implements chap8_014_MyInterface{
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	@Override							// 디폴트 메소드 재정의
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}
}
