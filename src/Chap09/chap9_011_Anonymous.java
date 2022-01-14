package Chap09;					// 익명 객체의 로컬 변수 사용

public class chap9_011_Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20;
		//arg2 = 20;
		
		//var1 = 30;
		//var2 = 30;
		
		chap9_011_Calculatable calc = new chap9_011_Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
