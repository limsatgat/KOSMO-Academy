package Chap05;					// ���� ��ü�� �޼ҵ�

public class chap5_013_EnumMethodExample {

	public static void main(String[] args) {
		//name() �޼ҵ�
		chap5_012_Week today = chap5_012_Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal �޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compare �޼ҵ�
		chap5_012_Week day1 = chap5_012_Week.MONDAY;
		chap5_012_Week day2 = chap5_012_Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() �޼ҵ�
		if(args.length == 1) {
			String strDay = args[0];
			chap5_012_Week weekday = chap5_012_Week.valueOf(strDay);
			if(weekday == chap5_012_Week.SATURDAY || weekday == chap5_012_Week.SUNDAY) 
				System.out.println("�ָ��̱���");
			} else {
				System.out.println("�����̱���");
			}
		

		//values() �޼ҵ�
		chap5_012_Week[] days = chap5_012_Week.values();
		for(chap5_012_Week day : days) {
			System.out.println(day);
		}
	}

}
