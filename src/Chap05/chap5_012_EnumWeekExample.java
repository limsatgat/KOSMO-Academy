package Chap05;					// ���� Ÿ�԰� ���� ���

import java.util.Calendar;						// Ķ���� Ŭ������ java.util ��Ű���� �����Ƿ� import�� �ʿ��ϴ�.

public class chap5_012_EnumWeekExample {

	public static void main(String[] args) {
		chap5_012_Week today = null;		// ���� Ÿ�Ը� ǥ������� ���� RUN ���� (���� Week)
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);		// week ǥ�� ���� (���� Week)
		
		switch(week) {
			case 1:										// chap5_012_Week ��ǥ�� (���Ż�� �̴���)
				today = chap5_012_Week.SUNDAY; break;
			case 2:
				today = chap5_012_Week.MONDAY; break;
			case 3:
				today = chap5_012_Week.TUESDAY; break;
			case 4:
				today = chap5_012_Week.WEDNESDAY; break;
			case 5:
				today = chap5_012_Week.THURSDAY; break;
			case 6:
				today = chap5_012_Week.FRIDAY; break;
			case 7:
				today = chap5_012_Week.SATURDAY; break;
		}
		
		System.out.println("���� ����: " + today);

		if(today == chap5_012_Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹ� �����մϴ�.");
		}
	}

}
