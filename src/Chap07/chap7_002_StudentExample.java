package Chap07;

public class chap7_002_StudentExample {

	public static void main(String[] args) {
	chap7_002_Student student = new chap7_002_Student("홍길동", "1234556-1234567", 1);
	System.out.println("name : " + student.name);					// 부모에서 물려받은 필드 출력
	System.out.println("ssn : " + student.ssn);
	System.out.println("studentNo : " +
						student.studentNo);

	
}

}