package Chap07;					// 자식 클래스

public class chap7_002_Student extends chap7_002_People{
	public int studentNo;
	
	public chap7_002_Student(String name, String ssn, int studentNo) {
		super(name, ssn);					// 부모 생성자 호출(super)
		this.studentNo = studentNo;
	}
}

