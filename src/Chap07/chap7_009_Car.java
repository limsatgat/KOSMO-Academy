package Chap07;					// Tire�� ��ǰ���� ������ Ŭ����

public class chap7_009_Car {
	//�ʵ�
	chap7_008_Tire[] chap7_008_Tires = {
			new chap7_008_Tire("�տ���", 6),
			new chap7_008_Tire("�տ�����", 2),
			new chap7_008_Tire("�ڿ���", 3),
			new chap7_008_Tire("�ڿ�����", 4),
	};
	
	//�޼ҵ�
	int run()	{
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		for(int i=0; i<chap7_008_Tires.length; i++) {
			if(chap7_008_Tires[i].roll()==false)	{
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop()	{
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
	
}
