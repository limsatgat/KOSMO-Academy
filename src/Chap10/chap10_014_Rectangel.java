package Chap10;					// �簢���� ���� ���ϱ�		

import java.util.Scanner;										// �ܼ� �Է� ��ü Ŭ����

public class chap10_014_Rectangel {		// Ŭ����
	int width;			// �ʵ�
	int height;			// �ʵ�
	
	public int getArea() {		// �޼ҵ�
		return width*height;	// ���๮
	}
	
	
	public static void main(String[] args) {
		chap10_014_Rectangel rect = new chap10_014_Rectangel();	// ��ü ����
		Scanner scanner = new Scanner(System.in);				// �ܼ� �Է� ��ü
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();							// Int ���� �Է¹ޱ�
		rect.height = scanner.nextInt();						// Int ���� �Է¹ޱ�
		
		System.out.println("�簢���� ������ " + rect.getArea());
		
		scanner.close();
	}

}



// 