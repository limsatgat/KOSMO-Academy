package Chap04;					// float 타입 카운터 변수

public class chap4_013_ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}									// 9번의 루프만 실행
											// float 타입은 0.1을 정확하게 표현 못함
	}

}
