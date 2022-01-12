package Chap07;					// tire의 자식 클래스

public class chap7_008_KumhoTire extends chap7_008_Tire{					// 타이어 클래스
	//필드
	//생성자
	public chap7_008_KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll()	{
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation)	{
			System.out.println(location + " chap7_008_KumhoTire 수명: " +
					(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " chap7_008_KumhoTire 펑크 ***");
			return false;
		}
	}
}
