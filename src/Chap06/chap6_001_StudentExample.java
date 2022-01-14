package Chap06;					// 클래스로부터 객체 생성

public class chap6_001_StudentExample {

	public static void main(String[] args) {					// 클래스명 chap6_001_Student
		chap6_001_Student s1 = new chap6_001_Student();			// 객체 : s1, s2
		System.out.println("s1 변수가 Studyent 객체를 참조합니다");
		
		chap6_001_Student s2 = new chap6_001_Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
				

	}

}
