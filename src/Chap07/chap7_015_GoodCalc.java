package Chap07;					// 추상 클래스 예제

public class chap7_015_GoodCalc extends chap7_015_Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i <a.length; i++)
			sum += a[i];
		return sum/a.length;
	}

	public static void main(String [] args) {
		chap7_015_GoodCalc c = new chap7_015_GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] { 2,3,4 }));
	}
}
