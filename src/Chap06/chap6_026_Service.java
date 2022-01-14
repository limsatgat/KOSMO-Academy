package Chap06;					// 어노테이션 적용 클래스

public class chap6_026_Service {
	@chap6_026_PrintAnnotation
	public void method1()	{
		System.out.println("실행 내용1");
	}
	
	@chap6_026_PrintAnnotation("*")
	public void method2()	{
		System.out.println("실행 내용2");
	}
	
	@chap6_026_PrintAnnotation(value="#", number=20)
	public void method3()	{
		System.out.println("실행 내용3");
	}
}
