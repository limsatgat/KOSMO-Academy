package Chap08;


class SamsungPhone implements chap8_002_PhoneInterFace {		// �������̽� ����
	// PhoneInterFace�� ��� �޼ҵ� ����
	@Override
	public void sendCall()	{
		System.out.println("�츮������");
	}
	@Override
	public void receiveCall()	{
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	//�޼ҵ� �߰� �ۼ�
	public void flash()	{ System.out.println("��ȭ�⿡ ���� �������ϴ�."); }
}

public class chap8_002_InterFaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}