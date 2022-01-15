package Chap10;					// 예외 처리	// 다중 catch문

public class chap10_007_CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");		// 여기서 Run as → Run Configurations → Arguments 문자/숫자 부여
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
			
		} catch(NumberFormatException e) {						// 여기서 Run as → Run Configurations → Arguments 숫자만 부여
			System.out.println("숫자로 변환할 수 없습니다.");
			
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
