package Chap10;					// ���� ó��		// AutoCloseable ���� Ŭ����

public class chap10_010_TryWithResourceExample {

	public static void main(String[] args) {
		try (chap10_010_FileInputStream fis = new chap10_010_FileInputStream("file.txt"))	{
			fis.read();
			throw new Exception();		// ���������� ���� �߻� ��Ŵ
		} catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}

	}

}
