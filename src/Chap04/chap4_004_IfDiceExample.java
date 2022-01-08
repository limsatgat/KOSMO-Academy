package Chap04;					// 주사위의 번호를 뽑는 에제

public class chap4_004_IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;		// 주사위 ㅂ너호 하나 뽑기

		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num ==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num ==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num ==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num ==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
