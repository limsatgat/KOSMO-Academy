package Chap07;					// �ڽ� Ŭ���� ���

public class chap7_001_DmbCellPhoneExample {

	public static void main(String[] args) {
		chap7_001_DmbCellPhone dmbCellPhone = new chap7_001_DmbCellPhone("������s20+", "����", 10);
		//DmbCellPhone ��ü ����
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);

		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

	
}

