package algorism;					// BOOK Ŭ����

public class Book {
	
		String title;				// �ʵ�
		String author;				// �ʵ�
		
		public Book(String t) { //������
			title = t; author = "���ڹ̻�";
		}
		
		public Book(String t, String a) {		// ������
			title = t; author = a;
		}

	public static void main(String[] args) {		// ��ü ����
		Book bo = new Book("�ſ��","�̰��� �ڹٴ�.");
		Book boo = new Book("�ڹ��� ����");
		
		
		System.out.println("å ������ " + bo.title);		// ���� ���
		System.out.println("���ڸ��� " + bo.author);		// ���� ���
		
		
	}
}

// ����� ���ڸ� ��Ÿ���� title �� author �ʵ带 ���� Book Ŭ������ �ۼ��ϰ�,
// ��ü �迭�� ����� å�� ����� ���ڸ� �Է¹޾� ������ ����Ͻÿ�
