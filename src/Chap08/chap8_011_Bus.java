package Chap08;					// 강제 타입 변환 // 구현 클래스

public class chap8_011_Bus implements chap8_011_Vehicle {
	@Override
	public void run()	{
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare()	{
		System.out.println("승차요금을 체크합니다.");
	}
}
