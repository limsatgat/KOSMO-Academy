package Chap07;					// �޼ҵ� �������̵� �׽�Ʈ

public class chap7_003_ComputerExample {


	public static void main(String[] args) {
		int r = 10;
		
		chap7_003_Calculator calculator = new chap7_003_Calculator();
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();
		
		chap7_003_Computer computer = new chap7_003_Computer();
		System.out.println("������ : " + computer.areaCircle(r));

		
	}

}
