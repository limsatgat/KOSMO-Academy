package Chap09;					// �͸� ���� ��ü ���� // UIŬ����

public class chap9_010_Window {
	chap9_010_Button button1 = new chap9_010_Button();
	chap9_010_Button button2 = new chap9_010_Button();
	
	//�ʵ� �ʱⰪ���� ����
	chap9_010_Button.OnClickListener listener = new chap9_010_Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
			
		}
	};
	
	chap9_010_Window()	{
		button1.setOnClickListener( listener );
		button2.setOnClickListener(new chap9_010_Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}


