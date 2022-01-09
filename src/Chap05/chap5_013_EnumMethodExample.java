package Chap05;					// 열거 객체의 메소드

public class chap5_013_EnumMethodExample {

	public static void main(String[] args) {
		//name() 메소드
		chap5_012_Week today = chap5_012_Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compare 메소드
		chap5_012_Week day1 = chap5_012_Week.MONDAY;
		chap5_012_Week day2 = chap5_012_Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		if(args.length == 1) {
			String strDay = args[0];
			chap5_012_Week weekday = chap5_012_Week.valueOf(strDay);
			if(weekday == chap5_012_Week.SATURDAY || weekday == chap5_012_Week.SUNDAY) 
				System.out.println("주말이군요");
			} else {
				System.out.println("평일이군요");
			}
		

		//values() 메소드
		chap5_012_Week[] days = chap5_012_Week.values();
		for(chap5_012_Week day : days) {
			System.out.println(day);
		}
	}

}
