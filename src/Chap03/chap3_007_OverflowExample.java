package Chap03;					// 오버플로우

public class chap3_007_OverflowExample {

	public static void main(String[] args)	{
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
	}
}
