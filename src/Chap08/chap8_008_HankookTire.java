package Chap08;					// 필드의 다형성 // 구현 클래스

public class chap8_008_HankookTire implements chap8_008_Tire {
	@Override
	public void roll()	{
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
