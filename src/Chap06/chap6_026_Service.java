package Chap06;					// ������̼� ���� Ŭ����

public class chap6_026_Service {
	@chap6_026_PrintAnnotation
	public void method1()	{
		System.out.println("���� ����1");
	}
	
	@chap6_026_PrintAnnotation("*")
	public void method2()	{
		System.out.println("���� ����2");
	}
	
	@chap6_026_PrintAnnotation(value="#", number=20)
	public void method3()	{
		System.out.println("���� ����3");
	}
}
