package Chap06;					// ������̼� ���� Ŭ����

public class chap6_027_Service {
	@chap6_027_PrintAnnotation
	public void method1()	{
		System.out.println("���� ����1");
	}
	
	@chap6_027_PrintAnnotation("*")
	public void method2()	{
		System.out.println("���� ����2");
	}
	
	@chap6_027_PrintAnnotation(value="#", number=20)
	public void method3()	{
		System.out.println("���� ����3");
	}
}
