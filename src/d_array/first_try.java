package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class first_try {

	public static void main(String[] args) {
		
		int score1[] = new int[3];
		int score2[] = new int[3];
		int score3[] = new int[3];
		int score4[] = new int[3];
		System.out.println("[입력]");
		System.out.print("조회할 학생 수를 입력하세요 : ");
		Scanner stu = new Scanner(System.in);
		String grade = stu.nextLine();
		System.out.println();
		System.out.println("====성적 계산을 시작합니다====");
		System.out.println();
		System.out.println("==각 학생의 성적 3과목을 입력하시오==");
		System.out.println();
		System.out.print("첫번째 학생 : ");
		
		Scanner stu1 = new Scanner(System.in);
		String first = stu1.nextLine();
		StringTokenizer first1 = new StringTokenizer(first,"/");
		for(int i=0; i<3; i++) {
			score1[i] = Integer.parseInt(first1.nextToken());
		}
		
		System.out.print("두번째 학생 : ");
		Scanner stu2 = new Scanner(System.in);
		String second = stu2.nextLine();
		StringTokenizer second2 = new StringTokenizer(second,"/");
		for(int j=0; j<3; j++) {
			score2[j] = Integer.parseInt(second2.nextToken());
		}
		
		System.out.print("세번째 학생 : ");
		Scanner stu3 = new Scanner(System.in);
		String third = stu3.nextLine();
		StringTokenizer third3 = new StringTokenizer(third,"/");
		for(int k=0; k<3; k++) {
			score3[k] = Integer.parseInt(third3.nextToken());
		}
		
		System.out.print("네번째 학생 : "); 
		Scanner stu4 = new Scanner(System.in);
		String fourth = stu4.nextLine();
		StringTokenizer fourth4 = new StringTokenizer(fourth,"/");
		for(int l=0; l<3; l++) {
			score4[l] = Integer.parseInt(fourth4.nextToken());
		}
		System.out.println();
		System.out.println("==성적 계산을 시작합니다==");
		
		getAverage(score1, "첫번째");
		getAverage(score2, "두번째");
		getAverage(score3, "세번째");
		getAverage(score4, "네번째");
	
//		int sum1 = 0;
//		for(int i=0; i<3; i++) {
//			sum1 += score1[i];
//		}
//		System.out.println("첫번째 학생의 총점은 " + sum1 + "점이고 평균은 " + (sum1/3.0) + "점 입니다.");
//		int sum2 = 0;
//		for(int j=0; j<3; j++) {
//			sum2 += score2[j];
//		}
//		System.out.println("두번째 학생의 총점은 " + sum2 + "점이고 평균은 " + (sum2/3.0) + "점 입니다.");
//		
//		int sum3 = 0;
//		for(int k=0; k<3; k++) {
//			sum3 += score3[k];
//		}
//		System.out.println("세번째 학생의 총점은 " + sum3 + "점이고 평균은 " + (sum3/3.0) + "점 입니다.");
//		
//		int sum4 = 0;
//		for(int l=0; l<3; l++) {
//			sum4 += score4[l];
//		}
//		System.out.println("네번째 학생의 총점은 " + sum4 + "점이고 평균은 " + (sum4/3.0) + "점 입니다.");	
	}
	
	public static void getAverage(int[] score, String message) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += score[i];
		}
		System.out.println(message + " 학생의 총점은 " + sum + "점이고 평균은 " + (sum/3.0) + "점 입니다.");	
	}
}