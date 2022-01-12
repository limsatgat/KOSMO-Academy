package Chap07;					// 메소드 오버라이딩 테스트

public class chap7_003_ComputerExample {


	public static void main(String[] args) {
		int r = 10;
		
		chap7_003_Calculator calculator = new chap7_003_Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		chap7_003_Computer computer = new chap7_003_Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));

		
	}

}
