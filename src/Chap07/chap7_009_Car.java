package Chap07;					// Tire를 부품으로 가지는 클래스

public class chap7_009_Car {
	//필드
	chap7_008_Tire[] chap7_008_Tires = {
			new chap7_008_Tire("앞왼쪽", 6),
			new chap7_008_Tire("앞오른쪽", 2),
			new chap7_008_Tire("뒤왼쪽", 3),
			new chap7_008_Tire("뒤오른쪽", 4),
	};
	
	//메소드
	int run()	{
		System.out.println("[자동차가 달립니다.]");
		for(int i=0; i<chap7_008_Tires.length; i++) {
			if(chap7_008_Tires[i].roll()==false)	{
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop()	{
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
