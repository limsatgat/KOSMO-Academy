package Chap04;					// continue�� ����� for��

public class chap4_021_ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {				// 2�� ���� �������� 0�� �ƴ� ���, �� Ȧ���� ���
				continue;
			}
			System.out.println(i);		// Ȧ���� ������� �ʴ´�.
		}

	}

}
