package Chap09;					// ��� Ŭ�������� ��� ����

public class chap9_004_A {
	int field1;
	void method1()	{ }
	
	static int field2;
	static void method2() { }
	
	class B	{
	void method()	{
		field1 = 10;				// ��� �ʵ�� �޼ҵ忡 ������ �� �ִ�.
		method1();
		
		field2 = 10;
		method2();
	}
	}
	
	static class C {
		void method() {
			//field1 = 10;			// �ν��Ͻ� �ʵ�� �޼ҵ�� ������ �� ����.
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}