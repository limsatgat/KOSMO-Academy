package Chap10;					//예외처리	//사용자 정의 발생 시키기

public class chap10_013_AccountExamle {

	public static void main(String[] args) {
		chap10_013_Account account = new chap10_013_Account();
		//예금하기
		account.deposit(20000);
		System.out.println("예금액: " + account.getBalance());
		// 출금하기
		try {
			account.withdraw(30000);
		} catch(chap10_012_BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
	