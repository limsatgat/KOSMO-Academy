package Chap09;					// ��ø �������̽� // ��ư �̺�Ʈ ó��

public class chap9_007_ButtonExample {

	public static void main(String[] args) {
		chap9_007_Button btn = new chap9_007_Button();
		
		btn.setOnClickListener(new chap9_007_CallListener());
		btn.touch();
		
		btn.setOnClickListener(new chap9_007_MessageListener());
		btn.touch();
	}

}
