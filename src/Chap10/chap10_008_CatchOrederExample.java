package Chap10;					// ���� ó��	// catch ����� ����

public class chap10_008_CatchOrederExample {
	public static void main(String[] args) {
	try {
		String data1 = args[0];
		String data2 = args[1];
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("���� �Ű����� ���� �����մϴ�.");		// ���⼭ Run as �� Run Configurations �� Arguments ����/���� �ο�
	} catch(Exception e) {
		System.out.println("���࿡ ������ �ֽ��ϴ�.");			// ���⼭ Run as �� Run Configurations �� Arguments ���ڸ� �ο�
	} finally {
		System.out.println("�ٽ� �����ϼ���.");
	}
}
}
