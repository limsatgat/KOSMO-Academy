package Chap04;					// 키보드로 while문 제어

public class chap4_017_WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {					// 엔터키가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외시킴
				System.out.println("----------------");			// 메뉴 생성
				System.out.println("1.증속 | 2.감속 | 3. 중지");
				System.out.println("----------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();							// 키보드의 키 코드를 읽음
			
			if(keyCode == 49) {
				speed++;
				System.out.println("현재 속도 =" + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재 속도 =" + speed);
			} else if (keyCode == 51) {
				run = false;									// while문을 종료하기 위해 run 변수에 false 저장
	}
	}
	
		System.out.println("프로그램 종료");
	}
}