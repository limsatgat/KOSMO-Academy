package Chap10;					// 예외 처리	// catch 블록의 순서

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
		System.out.println("실행 매개값의 수가 부족합니다.");		// 여기서 Run as → Run Configurations → Arguments 문자/숫자 부여
	} catch(Exception e) {
		System.out.println("실행에 문제가 있습니다.");			// 여기서 Run as → Run Configurations → Arguments 숫자만 부여
	} finally {
		System.out.println("다시 실행하세요.");
	}
}
}
