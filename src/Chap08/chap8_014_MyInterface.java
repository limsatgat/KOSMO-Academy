package Chap08;					// ����Ʈ �޼ҵ� // ���� �������̽�

public interface chap8_014_MyInterface {
	public void method1();
	
	public default void method2() {					// ����Ʈ �޼ҵ�
		System.out.println("MyInterface-method2 ����");
	}
	
}
