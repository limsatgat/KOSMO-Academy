package Chap10;					// ���� ó�� ���ѱ��

public class chap10_011_ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

	public static void findClass() throws ClassNotFoundException	{
		Class clazz = Class.forName("java.lang.String2");
	}
}
