package Chap04;					// ÁßÃ¸ if¹®

public class chap4_005_IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("Á¡¼ö: " + score);

		String grade;
		
		if(score>=90) {
			if(score>=95) {				// ÁßÃ¸ if¹®
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {				// ÁßÃ¸ if¹®
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
			System.out.println("ÇÐÁ¡: " + grade);
		}
	}


