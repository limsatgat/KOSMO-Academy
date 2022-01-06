package Chap03;					// 일반적인 계산에서의 부동소수점 타입 사용

public class chap3_010_AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면, ") ;
		System.out.println(result + "조각이 남는다.");

	}

}
