package Chap03;					// 오버플로우 해결

public class chap3_008_OverflowExample_C {

	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);

	}

}
