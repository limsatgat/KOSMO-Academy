package Chap06;					// �޼ҵ� �����ε�

public class chap6_013_CalculatorExample {

	public static void main(String[] args) {
		chap6_013_Calculator myCalcu = new chap6_013_Calculator();
		
		//���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		
		//���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//��� ���
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);
		

	}

}
