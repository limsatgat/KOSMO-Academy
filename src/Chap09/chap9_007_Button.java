package Chap09;						// ��ø �������̽�

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
