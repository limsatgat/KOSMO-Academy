package Chap07;

public class chap7_005_SportsCar extends chap7_005_Car {
	@Override
	public void speedUp() { speed += 10; }
	
	//오버라이딩을 할 수 없음					//부모클래스에서 final 선언하여 stop 불가
	/*@Override
	
	public void stop()	{
		System.out.println("스포츠카를 멈춤");
		speed = 0;*/
	}

