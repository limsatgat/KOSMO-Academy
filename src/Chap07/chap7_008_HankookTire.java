package Chap07;					// tire의 자식 클래스

public class chap7_008_HankookTire extends chap7_008_Tire{
	//필드
	//생성자
	public chap7_008_HankookTire(String location, int maxRotation)	{
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll()	{
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " chap7_008_HankookTire 수명: " +
					(maxRotation=accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " chap7_008_HankookTire 펑크 ***");
			return false;
		}
	}
}
