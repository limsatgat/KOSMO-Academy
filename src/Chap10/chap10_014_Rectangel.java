package Chap10;					// 사각형의 넓이 구하기		

import java.util.Scanner;										// 콘솔 입력 객체 클래스

public class chap10_014_Rectangel {		// 클래스
	int width;			// 필드
	int height;			// 필드
	
	public int getArea() {		// 메소드
		return width*height;	// 실행문
	}
	
	
	public static void main(String[] args) {
		chap10_014_Rectangel rect = new chap10_014_Rectangel();	// 객체 생성
		Scanner scanner = new Scanner(System.in);				// 콘솔 입력 객체
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();							// Int 형식 입력받기
		rect.height = scanner.nextInt();						// Int 형식 입력받기
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scanner.close();
	}

}



// 