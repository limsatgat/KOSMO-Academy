package Chap07;					// tire�� �ڽ� Ŭ����

public class chap7_008_HankookTire extends chap7_008_Tire{
	//�ʵ�
	//������
	public chap7_008_HankookTire(String location, int maxRotation)	{
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override
	public boolean roll()	{
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " chap7_008_HankookTire ����: " +
					(maxRotation=accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " chap7_008_HankookTire ��ũ ***");
			return false;
		}
	}
}
