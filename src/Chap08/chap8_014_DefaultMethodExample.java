package Chap08;					// 디폴트 메소드 // 사용

public class chap8_014_DefaultMethodExample {
	public static void main(String[] args)	{
		chap8_014_MyInterface mi1 = new chap8_014_MyClassA();
		mi1.method1();
		mi1.method2();
		
		chap8_014_MyInterface mi2 = new chap8_014_MyClassB();
		mi2.method1();
		mi2.method2();
	}
}
