package Chap07;					// 타이어를 부품으로 가지는 클래스

public class chap7_008_Car {
	//필드
	chap7_008_Tire frontLeftTire = new chap7_008_Tire("앞왼쪽", 6);
	chap7_008_Tire frontRightTire = new chap7_008_Tire("앞오른쪽", 2);
	chap7_008_Tire backLeftTire = new chap7_008_Tire("뒤왼쪽", 3);
	chap7_008_Tire backRightTire = new chap7_008_Tire("뒤오른쪽", 4);
	//생성자
	//메소드
	int run()	{
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLeftTire.roll()==false) { stop(); return 3; }
		if(backRightTire.roll()==false) { stop(); return 4; }
		return 0;
	}
	
	void stop()	{
		System.out.println("[자동차가 멈춥니다.]");
	}
}
