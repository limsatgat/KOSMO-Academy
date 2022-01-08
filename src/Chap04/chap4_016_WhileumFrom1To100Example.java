package Chap04;					// 1부터 100까지 합을 출력

public class chap4_016_WhileumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;			// 합게를 저장할 변수
		
		int i = 1;				// 카운터 변수
		
		while(i<=100) {
			sum += i;
			i++;
		}

		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}

}
