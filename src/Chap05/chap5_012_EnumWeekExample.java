package Chap05;					// 열거 타입과 여러 상수

import java.util.Calendar;						// 캘린더 클래스는 java.util 패키지에 있으므로 import가 필요하다.

public class chap5_012_EnumWeekExample {

	public static void main(String[] args) {
		chap5_012_Week today = null;		// 열거 타입명 표기오류로 인한 RUN 에러 (기존 Week)
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);		// week 표기 오류 (기존 Week)
		
		switch(week) {
			case 1:										// chap5_012_Week 미표기 (열거상수 미대입)
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
		
		System.out.println("오늘 요일: " + today);

		if(today == chap5_012_Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}
