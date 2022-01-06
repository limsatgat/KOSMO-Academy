package Chap03;					// "NaN"을 체크하고 연산 수행

public class chap3_012_InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val))	{								// NaN을 검사함
			System.out.println("NaN이 입력되어 처리할 수 없음");		// NaN일 경우 실행되는 코드
			val = 0.0;
		}

		currentBalance += val;									// cirremtBalance의 원래 값이 유지
		System.out.println(currentBalance);
		
	}

}
