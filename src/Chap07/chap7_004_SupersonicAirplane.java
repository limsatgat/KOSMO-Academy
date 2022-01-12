package Chap07;					// super 변수

public class chap7_004_SupersonicAirplane extends chap7_004_Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
			
		}
	}
}
