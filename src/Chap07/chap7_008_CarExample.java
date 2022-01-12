package Chap07;					// 실행 클래스

public class chap7_008_CarExample {

	public static void main(String[] args) {
		chap7_008_Car chap7_008_Car = new chap7_008_Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = chap7_008_Car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				chap7_008_Car.frontLeftTire = new chap7_008_HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 HankookTire로 교체");
				chap7_008_Car.frontRightTire = new chap7_008_HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				chap7_008_Car.backLeftTire = new chap7_008_HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankookTire로 교체");
				chap7_008_Car.backRightTire = new chap7_008_HankookTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("----------------------------");
		}

	}

}
