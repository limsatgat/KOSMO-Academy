package Chap07;					// �������� �� ���� final �޼ҵ�

public class chap7_005_Car {
	//�ʵ�
	public int speed;
	
	//�޼ҵ�
	public void speedUp() { speed += 1; }
			
	//final �޼ҵ�
			public final void stop()	{
				System.out.println("���� ����");
				speed = 0;
			
	}
}
