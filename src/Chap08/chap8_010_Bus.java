package Chap08;					// 매개 변수의 다형성 // 구현 클래스

public class chap8_010_Bus implements chap8_010_Vehicle {
	@Override
	public void run()	{
		System.out.println("버스가 달립니다.");
	}
}
