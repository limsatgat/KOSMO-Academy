package Chap06;					// ΩÃ±€≈Ê

public class chap6_018_Singleton {
	private static chap6_018_Singleton singleton = new chap6_018_Singleton();
	
	private chap6_018_Singleton()	{}
	
	static chap6_018_Singleton getInstance()	{
		return singleton;
	}
}
