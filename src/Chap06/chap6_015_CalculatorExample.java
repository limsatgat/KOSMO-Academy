package Chap06;					// 정적 멤버 사용

public class chap6_015_CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * chap6_015_Calculator.pi;
		int result2 = chap6_015_Calculator.plus(10, 5);
		int result3 = chap6_015_Calculator.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result1 : " + result2);
		System.out.println("result1 : " + result3);
	}

}
