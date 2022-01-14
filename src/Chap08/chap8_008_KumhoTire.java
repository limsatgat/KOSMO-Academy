package Chap08;					// 필드의 다형성 // 구현클래스

public class chap8_008_KumhoTire implements chap8_008_Tire {
	@Override
	public void roll()	{
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}