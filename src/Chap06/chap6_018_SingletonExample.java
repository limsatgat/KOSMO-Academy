package Chap06;					// �̱��� ��ü

public class chap6_018_SingletonExample {

	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton();		//�����Ͽ���
		 Singleton obj2 = new Singleton();		//�����Ͽ���
		 */

		chap6_018_Singleton obj1 = chap6_018_Singleton.getInstance();
		chap6_018_Singleton obj2 = chap6_018_Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
	}

}
