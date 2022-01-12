package Chap07;					// 추상 메소드 오버라이딩

public class chap7_014_Cat extends chap7_014_Animal{
	public chap7_014_Cat()	{
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
