package Chap03;					// "NaN"�� üũ�ϰ� ���� ����

public class chap3_012_InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val))	{								// NaN�� �˻���
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");		// NaN�� ��� ����Ǵ� �ڵ�
			val = 0.0;
		}

		currentBalance += val;									// cirremtBalance�� ���� ���� ����
		System.out.println(currentBalance);
		
	}

}
