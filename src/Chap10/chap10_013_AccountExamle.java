package Chap10;					//����ó��	//����� ���� �߻� ��Ű��

public class chap10_013_AccountExamle {

	public static void main(String[] args) {
		chap10_013_Account account = new chap10_013_Account();
		//�����ϱ�
		account.deposit(20000);
		System.out.println("���ݾ�: " + account.getBalance());
		// ����ϱ�
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
	