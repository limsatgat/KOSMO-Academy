package Chap06;					// final 필드 테스트

public class chap6_019_PersonExample {

	public static void main(String[] args) {
		chap6_019_Person p1 = new chap6_019_Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";					// final 필드는 값 수정 불가
		//p1.ssn = "654321-7654321";
		p1.name = "을지문덕";

	}

}
