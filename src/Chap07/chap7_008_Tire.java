package Chap07;

public class chap7_008_Tire {
	//�ʵ�
	public int maxRotation;				//�ִ� ȸ�� ��(Ÿ�̾� ����)
	public int accumulatedRotation;		//���� ȸ�� ��
	public String location;				//Ÿ�̾��� ��ġ
	
	//������
	public chap7_008_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " chap7_008_Tire ����: " +
							(maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " chap7_008_Tire ��ũ ***");
			return false;
		}
			
	}
	
}
