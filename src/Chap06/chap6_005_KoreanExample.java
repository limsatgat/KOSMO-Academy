package Chap06;					// 객체 생성 후 필드값 출력

public class chap6_005_KoreanExample {

	public static void main(String[] args) {
		chap6_005_Korean k1 = new chap6_005_Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		chap6_005_Korean k2 = new chap6_005_Korean("김자바", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
