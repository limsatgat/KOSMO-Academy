package Chap09;					// ��ø Ŭ�������� �ٱ� Ŭ���� ���� ��� ���� Ŭ����

public class chap9_006_OutterExample {

	public static void main(String[] args) {
		chap9_006_Outter outter = new chap9_006_Outter();
		chap9_006_Outter.Nested nested = outter.new Nested();
		nested.print();

	}

}
