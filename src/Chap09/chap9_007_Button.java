package Chap09;						// 중첩 인터페이스

public class chap9_007_Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener)	{
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
