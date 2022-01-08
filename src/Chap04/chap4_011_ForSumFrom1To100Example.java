package Chap04;					// 1부터 100까지 합을 출력

public class chap4_011_ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;					// 합계 변수
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}

		System.out.println("1~100의 합 :" + sum);
	}

}
