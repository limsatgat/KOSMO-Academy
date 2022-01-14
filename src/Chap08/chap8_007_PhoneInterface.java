package Chap08;					// 예제

public interface chap8_007_PhoneInterface {	//인터페이스 선언
	final int TIMEOUT = 10000;	// 상수 필드 선언
	void sendcall();	// 추상 메소드
	void receciveCall();	// 추상 메소드
	default void printLogo() {		// 디폴트 메소드
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface extends chap8_007_PhoneInterface	{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface	{	// 인터페이스 선언
	public void play();
	public void	stop();
}
class PDA {	//클래스 작성
	public int calculate(int x, int y)	{
		return x + y;
}
}
// SmartPhone 클래스는 PDA를 상속받고,
// MobilePhoneInterFACE와 mp3Interface 인터페이스에 선언된 추상 메소드를 모두 구현한다.

class SmartPhone extends PDA implements
MobilePhoneInterface, MP3Interface	{
	// MobilePhoneInterface의 추상 메소드 구현
	
	@Override
	public void sendSMS()	{
		System.out.println("문자갑니다.");
	}
	@Override
	public void receiveSMS()	{
		System.out.println("문자왔어요.");
	}
	// MP3Interface의 추상 메소드 구현
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void stop()	{
		System.out.println("음악 중단합니다.");
	}
	//추가로 작성한 메소드
	public void schedule()	{
		System.out.println("일정 관리합니다.");
	}
	@Override
	public void sendcall() {
		System.out.println("따르릉따르릉~~.");
		
	}
	@Override
	public void receciveCall() {
		System.out.println("전화왔어요.");
		
	}
}
class InterfaceEx {
	public static void main(String[] args)	{
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendcall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}
}