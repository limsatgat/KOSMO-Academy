package Chap09;					// ��ø Ŭ�������� �ٱ� Ŭ���� ���� ���

public class chap9_006_Outter {
	String field = "Outter=field";
	void method()	{
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method()	{
			System.out.println("Nested=method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(chap9_006_Outter.this.field);
			chap9_006_Outter.this.method();
		}
	}
}
