package Chap10;					// ����ó��	// ���� ĳ���� ����

public class chap10_004_ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal)	{
		if(animal instanceof Dog)	{ // �߿�
		Dog dog = (Dog) animal;			// ClassCastException �߻� ����
	}
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
