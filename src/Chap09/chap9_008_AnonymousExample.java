package Chap09;					// 익명객체	//익명자식 객체 생성

public class chap9_008_AnonymousExample {

	public static void main(String[] args) {
		chap9_008_Anonymous anony = new chap9_008_Anonymous();
		//익명 객체 필드 사용
		anony.field.wake();
		//익명 객체 로컬 변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(
				new chap9_008_Person()	{							// 매개값
					void study()	{
						System.out.println("저녁식사합니다.");
					}
					@Override
					void wake()	{
						System.out.println("18시에 도착했습니다.");
						study();
					}
				}
				);
	}

}
