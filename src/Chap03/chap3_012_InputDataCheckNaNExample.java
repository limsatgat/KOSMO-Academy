package Chap03;					// "NaN" ���ڿ��� ������

public class chap3_012_InputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";							// ����ڷκ��� �Է¹��� ��
				double val = Double.valueOf( userInput);	// �Է°��� double Ÿ������ ��ȯ

				double currentBalance = 10000.0;
				
				currentBalance += val;						// currentBalance�� NaN�� �����
				System.out.println(currentBalance);
	}
	

}
