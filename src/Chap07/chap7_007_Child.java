package Chap07;					// 자동 타입 변환 후의 멤버 접근

public class chap7_007_Child extends chap7_007_Parent {
	@Override
	public void method2()	{
		System.out.println("Child-method2()");
	}
	public void method3()	{
		System.out.println("Child-method3()");
	}
}
