package Chap09;					// �͸�ü	// �͸� �ڽ� ��ü ����

public class chap9_008_Anonymous {
	//�ʵ� �ʱⰪ���� ����
	chap9_008_Person field = new chap9_008_Person()	{						// �ʵ� ����� �ʱⰪ ����
		void work()	{
			System.out.println("�İ� ����մϴ�.");
		}
		@Override
		void wake()	{
			System.out.println("7�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1()	{
		//���� ���������� ����
		chap9_008_Person localVar = new chap9_008_Person()	{				// ���� ���� ����� �ʱⰪ ����
			void walk()	{
				System.out.println("����մϴ�.");
			}
		@Override
		void wake()	{
			System.out.println("17�ÿ� ���ƽ��ϴ�.");
			walk();
		}
		};
		//���� ���� ���
		localVar.wake();
	}
	
	void method2(chap9_008_Person person) {
		person.wake();
	}
}
