package Chap07;					// �ڵ� Ÿ�� ��ȯ ���� ��� ����

public class chap7_007_ChildExample {

	public static void main(String[] args) {
		chap7_007_Child child = new chap7_007_Child();
		
		chap7_007_Parent parent = child;
		parent.method2();
		parent.method1();
		//chap7_007_Parent.method3();
	}

}
