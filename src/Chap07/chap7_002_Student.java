package Chap07;					// �ڽ� Ŭ����

public class chap7_002_Student extends chap7_002_People{
	public int studentNo;
	
	public chap7_002_Student(String name, String ssn, int studentNo) {
		super(name, ssn);					// �θ� ������ ȣ��(super)
		this.studentNo = studentNo;
	}
}

