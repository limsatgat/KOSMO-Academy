package Chap07;					// tire�� �ڽ� Ŭ����

public class chap7_008_KumhoTire extends chap7_008_Tire{					// Ÿ�̾� Ŭ����
	//�ʵ�
	//������
	public chap7_008_KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override
	public boolean roll()	{
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation)	{
			System.out.println(location + " chap7_008_KumhoTire ����: " +
					(maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " chap7_008_KumhoTire ��ũ ***");
			return false;
		}
	}
}
