package Chap07;					// ���� Ŭ����

public class chap7_014_AnimalExample {

	public static void main(String[] args) {
		chap7_014_Dog dog = new chap7_014_Dog();
		chap7_014_Cat cat = new chap7_014_Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//������ �ڵ� Ÿ�� ��ȯ
		chap7_014_Animal animal = null;
		animal = new chap7_014_Dog();
		animal.sound();
		animal = new chap7_014_Cat();
		animal.sound();
		System.out.println("-----");
		
		//�޼ҵ��� ������
		animalSound(new chap7_014_Dog());
		animalSound(new chap7_014_Cat());
	}

	
	public static void animalSound(chap7_014_Animal animal) {
		animal.sound();
	}
}
