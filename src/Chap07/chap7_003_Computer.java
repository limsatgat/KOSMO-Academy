package Chap07;					// �޼ҵ� �������̵� // �ڽ� Ŭ����

public class chap7_003_Computer extends chap7_003_Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}

}

