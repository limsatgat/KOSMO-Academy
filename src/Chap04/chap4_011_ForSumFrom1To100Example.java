package Chap04;					// 1���� 100���� ���� ���

public class chap4_011_ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;					// �հ� ����
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}

		System.out.println("1~100�� �� :" + sum);
	}

}
