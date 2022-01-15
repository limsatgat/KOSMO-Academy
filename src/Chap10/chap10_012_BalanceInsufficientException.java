package Chap10;					// 예외 처리 // 사용자 정의 예외 클래스

public class chap10_012_BalanceInsufficientException extends Exception{
	public chap10_012_BalanceInsufficientException() { }
	public chap10_012_BalanceInsufficientException(String message) {
		super(message);
	}
}
