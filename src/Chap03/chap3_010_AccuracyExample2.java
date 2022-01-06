package Chap03;					// 정확한 계산을 위한 부동소수점 타입 미사용

public class chap3_010_AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면, ") ;
		System.out.println(result + "조각이 남는다.");
	}

}
