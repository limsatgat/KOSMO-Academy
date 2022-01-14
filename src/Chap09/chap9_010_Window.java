package Chap09;					// 익명 구현 개체 생성 // UI클래스

public class chap9_010_Window {
	chap9_010_Button button1 = new chap9_010_Button();
	chap9_010_Button button2 = new chap9_010_Button();
	
	//필드 초기값으로 대입
	chap9_010_Button.OnClickListener listener = new chap9_010_Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	chap9_010_Window()	{
		button1.setOnClickListener( listener );
		button2.setOnClickListener(new chap9_010_Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}


