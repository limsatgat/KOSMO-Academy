package Chap06;					// return ��

public class chap6_010_CarExample {

	public static void main(String[] args) {
		chap6_010_Car myCar = new chap6_010_Car();
		
		myCar.setGas(5);	//Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();	// Car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();	//Car�� run()�޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {		//Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
