package Chap07;					// ���� Ŭ����

public class chap7_008_CarExample {

	public static void main(String[] args) {
		chap7_008_Car chap7_008_Car = new chap7_008_Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = chap7_008_Car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				chap7_008_Car.frontLeftTire = new chap7_008_HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� HankookTire�� ��ü");
				chap7_008_Car.frontRightTire = new chap7_008_HankookTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				chap7_008_Car.backLeftTire = new chap7_008_HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� HankookTire�� ��ü");
				chap7_008_Car.backRightTire = new chap7_008_HankookTire("�ڿ�����", 17);
				break;
			}
			System.out.println("----------------------------");
		}

	}

}
