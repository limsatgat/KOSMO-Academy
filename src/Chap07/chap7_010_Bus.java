package Chap07;					// 매개 변수의 다형성 // 자식클래스

public class chap7_010_Bus extends chap7_010_Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
