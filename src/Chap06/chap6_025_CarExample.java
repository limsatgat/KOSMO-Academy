package Chap06;					// Getter �� Setter �޼ҵ� ���

public class chap6_025_CarExample {
	public static void main(String[] args) {
		chap6_025_Car myCar = new chap6_025_Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}

}
