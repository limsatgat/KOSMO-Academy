package Chap07;					// 매개 변수의 다형성 // 자식 클래스

public class chap7_010_Taxi extends chap7_010_Vehicle {
	@Override
	public void run()	{
		System.out.println("택시가 달립니다.");
	}
}
