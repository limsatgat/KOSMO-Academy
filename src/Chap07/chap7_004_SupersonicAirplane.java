package Chap07;					// super ����

public class chap7_004_SupersonicAirplane extends chap7_004_Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			//Airplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();
			
		}
	}
}
