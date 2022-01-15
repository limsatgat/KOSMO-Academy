package Chap10;					// 예외 처리		// AutoCloseable 구현 클래스

public class chap10_010_TryWithResourceExample {

	public static void main(String[] args) {
		try (chap10_010_FileInputStream fis = new chap10_010_FileInputStream("file.txt"))	{
			fis.read();
			throw new Exception();		// 강제적으로 예외 발생 시킴
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}
