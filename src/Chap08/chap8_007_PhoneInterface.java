package Chap08;					// ����

public interface chap8_007_PhoneInterface {	//�������̽� ����
	final int TIMEOUT = 10000;	// ��� �ʵ� ����
	void sendcall();	// �߻� �޼ҵ�
	void receciveCall();	// �߻� �޼ҵ�
	default void printLogo() {		// ����Ʈ �޼ҵ�
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface extends chap8_007_PhoneInterface	{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface	{	// �������̽� ����
	public void play();
	public void	stop();
}
class PDA {	//Ŭ���� �ۼ�
	public int calculate(int x, int y)	{
		return x + y;
}
}
// SmartPhone Ŭ������ PDA�� ��ӹް�,
// MobilePhoneInterFACE�� mp3Interface �������̽��� ����� �߻� �޼ҵ带 ��� �����Ѵ�.

class SmartPhone extends PDA implements
MobilePhoneInterface, MP3Interface	{
	// MobilePhoneInterface�� �߻� �޼ҵ� ����
	
	@Override
	public void sendSMS()	{
		System.out.println("���ڰ��ϴ�.");
	}
	@Override
	public void receiveSMS()	{
		System.out.println("���ڿԾ��.");
	}
	// MP3Interface�� �߻� �޼ҵ� ����
	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public void stop()	{
		System.out.println("���� �ߴ��մϴ�.");
	}
	//�߰��� �ۼ��� �޼ҵ�
	public void schedule()	{
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public void sendcall() {
		System.out.println("������������~~.");
		
	}
	@Override
	public void receciveCall() {
		System.out.println("��ȭ�Ծ��.");
		
	}
}
class InterfaceEx {
	public static void main(String[] args)	{
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendcall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3, 5));
		phone.schedule();
	}
}