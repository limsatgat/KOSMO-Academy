package Chap08;					// 인터페이스 상속 // 호출 가능 메소드

public class chap8_013_Example {
	public static void main(String[] args) {
		chap8_013_ImplementationC imp1 = new chap8_013_ImplementationC();
		
		chap8_013_InterfaceA ia = imp1;
		ia.methodA();							//InterfaceA 변수는 methodA()만 호출 가능
		System.out.println();
		
		chap8_013_InterfaceB ib = imp1;
		ib.methodB();							//InterfaceB 변수는 methodB()만 호출 가능
		System.out.println();
		
		chap8_013_InterfaceC ic = imp1;
		ic.methodA();							//InterfaceC 변수는 methodA(),
		ic.methodB();							//methodB(), methodC() 모두 호출 가능
		ic.methodC();
	}
}
