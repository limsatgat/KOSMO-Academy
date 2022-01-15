package Chap10;					// 예외처리	// 강제 캐스팅 예외

public class chap10_004_ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal)	{
		if(animal instanceof Dog)	{ // 중요
		Dog dog = (Dog) animal;			// ClassCastException 발생 가능
	}
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
