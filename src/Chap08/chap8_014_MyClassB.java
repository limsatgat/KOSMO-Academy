package Chap08;					// ����Ʈ �޼ҵ� // ���ο� ���� Ŭ����

public class chap8_014_MyClassB implements chap8_014_MyInterface{
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() ����");
	}
	
	@Override							// ����Ʈ �޼ҵ� ������
	public void method2() {
		System.out.println("MyClassB-method2() ����");
	}
}
