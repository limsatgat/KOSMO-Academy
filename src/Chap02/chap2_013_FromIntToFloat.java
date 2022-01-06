package Chap02;					// 정수 타입을 실수 타입으로 변환 시 정밀도 손실 방지

public class chap2_013_FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);

	}

}
