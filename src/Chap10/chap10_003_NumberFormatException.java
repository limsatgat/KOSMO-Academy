package Chap10;					// ����ó��	//Number ���� �߻��ϴ� ���

public class chap10_003_NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);	// NUmberFormatExcepetion �߻�
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}
