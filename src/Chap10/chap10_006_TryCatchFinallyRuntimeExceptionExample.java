package Chap10;				// 예외 처리	//실행 예외 처리

public class chap10_006_TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");					// 여기서 Run as → Run Configurations → Arguments 값 부여
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");						// Arguments 값에서 "치킨" 때문에 변환 에러
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
