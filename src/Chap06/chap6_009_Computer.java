package Chap06;					// 매개 벼누의 수를 모를 경우

public class chap6_009_Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i <values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
