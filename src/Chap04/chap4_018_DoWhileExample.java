package Chap04;					// do-while 문

import java.util.Scanner;										// Scanner 클래스를 사용하기 위해 필요

public class chap4_018_DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);				// Scanner 객체 생성
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();					// 키보드로 입력한 문자열을 얻음
			System.out.println(inputString);	
		} while( ! inputString.equals("q") );					// 문자열을 비교할 떄는 equals() 메소드를 얻음

		System.out.println();
		System.out.println("프로그램 종료");
	}

}
