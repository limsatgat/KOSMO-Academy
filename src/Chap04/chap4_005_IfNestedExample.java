package Chap04;					// ��ø if��

public class chap4_005_IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("����: " + score);

		String grade;
		
		if(score>=90) {
			if(score>=95) {				// ��ø if��
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {				// ��ø if��
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
			System.out.println("����: " + grade);
		}
	}


