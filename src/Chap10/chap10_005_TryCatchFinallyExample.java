package Chap10;					// 예외처리	// 일반 예외 처리

public class chap10_005_TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.langString2");
	} catch(ClassNotFoundException e) {
		System.out.println("클래스가 존재하지 않습니다.");
	}
	}
}
