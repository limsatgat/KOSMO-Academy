package Chap09;					// ��ø Ŭ���� ��ü ����

public class chap9_002_Main {
	public static void main(String[] args) {
		chap9_001_A a = new chap9_001_A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		chap9_001_A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		chap9_001_A.C c = new chap9_001_A.C();
		c.field1 = 3;
		c.method1()	;
		chap9_001_A.C.field2 = 3;
		chap9_001_A.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
