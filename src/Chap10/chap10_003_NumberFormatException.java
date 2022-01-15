package Chap10;					// 예외처리	//Number 예외 발생하는 경우

public class chap10_003_NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);	// NUmberFormatExcepetion 발생
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}
