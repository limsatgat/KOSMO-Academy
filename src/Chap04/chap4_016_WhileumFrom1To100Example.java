package Chap04;					// 1���� 100���� ���� ���

public class chap4_016_WhileumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;			// �հԸ� ������ ����
		
		int i = 1;				// ī���� ����
		
		while(i<=100) {
			sum += i;
			i++;
		}

		System.out.println("1~" + (i-1) + " �� : " + sum);
	}

}
