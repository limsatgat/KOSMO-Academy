package Chap07;					// 객체 타입 확인


public class chap7_012_InstanceofExample {

	public static void method1(chap7_012_Parent chap7_012_Parent) {
		if(chap7_012_Parent instanceof chap7_012_Child) {
			chap7_012_Child chap7_012_Child = (chap7_012_Child) chap7_012_Parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	

	public static void method2(chap7_012_Parent chap7_012_Parent) {
		chap7_012_Child chap7_012_Child = (chap7_012_Child) chap7_012_Parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		chap7_012_Parent parentA = new chap7_012_Child();
		method1(parentA);
		method2(parentA);
		
		chap7_012_Parent parentB = new chap7_012_Parent();
		method1(parentB);
		method2(parentB);	//예외발생
	}
}
