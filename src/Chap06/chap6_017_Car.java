package Chap06;					// ���� �޼ҵ�� ��� ���� �� ������ ��

public class chap6_017_Car {
	int speed;
	
	void run()	{
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		chap6_017_Car myCar = new chap6_017_Car();
		myCar.speed = 60;
		myCar.run();

	}

}
