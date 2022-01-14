package Chap06;					// 메소드 오버로딩

public class chap6_013_CalculatorExample {

	public static void main(String[] args) {
		chap6_013_Calculator myCalcu = new chap6_013_Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
		

	}

}
