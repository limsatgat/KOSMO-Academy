package Chap07;					// 실행 클래스

public class chap7_014_AnimalExample {

	public static void main(String[] args) {
		chap7_014_Dog dog = new chap7_014_Dog();
		chap7_014_Cat cat = new chap7_014_Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		chap7_014_Animal animal = null;
		animal = new chap7_014_Dog();
		animal.sound();
		animal = new chap7_014_Cat();
		animal.sound();
		System.out.println("-----");
		
		//메소드의 다형성
		animalSound(new chap7_014_Dog());
		animalSound(new chap7_014_Cat());
	}

	
	public static void animalSound(chap7_014_Animal animal) {
		animal.sound();
	}
}
