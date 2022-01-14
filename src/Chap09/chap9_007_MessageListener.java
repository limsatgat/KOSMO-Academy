package Chap09;					// 중첩 인터페이스 // 구현 클래스

public class chap9_007_MessageListener implements chap9_007_Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
