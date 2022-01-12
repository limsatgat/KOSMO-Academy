package Chap07;					// 자식 클래스 사용

public class chap7_001_DmbCellPhoneExample {

	public static void main(String[] args) {
		chap7_001_DmbCellPhone dmbCellPhone = new chap7_001_DmbCellPhone("갤럭시s20+", "검정", 10);
		//DmbCellPhone 객체 생성
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);

		//DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

	
}

