package Chap10;					// ����ó��	// �Ϲ� ���� ó��

public class chap10_005_TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.langString2");
	} catch(ClassNotFoundException e) {
		System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
	}
	}
}
