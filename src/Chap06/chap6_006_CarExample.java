package Chap06;					// ��ü ���� �� ������ ����

public class chap6_006_CarExample {

	public static void main(String[] args) {
		chap6_006_Car car1 = new chap6_006_Car();					// ������ 1��
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		chap6_006_Car car2 = new chap6_006_Car("�ڰ���");				// ������ 2�� () �ȿ� ���Է½� null �� ǥ��
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		chap6_006_Car car3 = new chap6_006_Car("�ڰ���", "����");		// ������ 3��
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		chap6_006_Car car4 = new chap6_006_Car("�ý�", "����", 200);	// ������ 4��
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
		
		
	}

}
