package Chap06;					// 싱글톤 객체

public class chap6_018_SingletonExample {

	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton();		//컴파일에러
		 Singleton obj2 = new Singleton();		//컴파일에러
		 */

		chap6_018_Singleton obj1 = chap6_018_Singleton.getInstance();
		chap6_018_Singleton obj2 = chap6_018_Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
