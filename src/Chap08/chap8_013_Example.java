package Chap08;					// �������̽� ��� // ȣ�� ���� �޼ҵ�

public class chap8_013_Example {
	public static void main(String[] args) {
		chap8_013_ImplementationC imp1 = new chap8_013_ImplementationC();
		
		chap8_013_InterfaceA ia = imp1;
		ia.methodA();							//InterfaceA ������ methodA()�� ȣ�� ����
		System.out.println();
		
		chap8_013_InterfaceB ib = imp1;
		ib.methodB();							//InterfaceB ������ methodB()�� ȣ�� ����
		System.out.println();
		
		chap8_013_InterfaceC ic = imp1;
		ic.methodA();							//InterfaceC ������ methodA(),
		ic.methodB();							//methodB(), methodC() ��� ȣ�� ����
		ic.methodC();
	}
}
