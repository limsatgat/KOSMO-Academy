package Chap08;					// 디폴트 메소드 // 수정 인터페이스

public interface chap8_014_MyInterface {
	public void method1();
	
	public default void method2() {					// 디폴트 메소드
		System.out.println("MyInterface-method2 실행");
	}
	
}
