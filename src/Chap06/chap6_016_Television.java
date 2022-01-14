package Chap06;					// 정적 초기화 블록

public class chap6_016_Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
