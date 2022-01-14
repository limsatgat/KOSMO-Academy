package Chap06;					// 메소드 호출

public class chap6_008_CalculatorExample {

	public static void main(String[] args) {
		chap6_008_Calculator myCalc = new chap6_008_Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);

		myCalc.powerOff();
	}

}
