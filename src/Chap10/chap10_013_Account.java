package Chap10;					// ����ó�� // ����� ���� ���� �߻���Ű��

public class chap10_013_Account {
	private long balance;
	
	public chap10_013_Account()	{}
	
	public long getBalance()	{
		return balance;
	}
	public void deposit(int money)	{
		balance += money;
	}
	public void withdraw(int money) throws chap10_012_BalanceInsufficientException {					// ����� ���� ���� ���ѱ��
		if(balance < money) {
			throw new chap10_012_BalanceInsufficientException("�ܰ����:"+(money-balance)+" ���ڶ�");		// ����� ���� ���� �߻�
		}
		balance -= money;
	}
	
}
