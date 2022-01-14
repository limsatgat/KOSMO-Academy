package Chap06;					// 정적 메소드와 블록 선언 시 주의할 점

public class chap6_017_Car {
	int speed;
	
	void run()	{
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		chap6_017_Car myCar = new chap6_017_Car();
		myCar.speed = 60;
		myCar.run();

	}

}
