package Chap09;					// 중첩 인터페이스 // 버튼 이벤트 처리

public class chap9_007_ButtonExample {

	public static void main(String[] args) {
		chap9_007_Button btn = new chap9_007_Button();
		
		btn.setOnClickListener(new chap9_007_CallListener());
		btn.touch();
		
		btn.setOnClickListener(new chap9_007_MessageListener());
		btn.touch();
	}

}
