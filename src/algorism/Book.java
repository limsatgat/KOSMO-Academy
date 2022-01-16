package algorism;					// BOOK 클래스

public class Book {
	
		String title;				// 필드
		String author;				// 필드
		
		public Book(String t) { //생성자
			title = t; author = "작자미상";
		}
		
		public Book(String t, String a) {		// 생성자
			title = t; author = a;
		}

	public static void main(String[] args) {		// 객체 생성
		Book bo = new Book("신용권","이것이 자바다.");
		Book boo = new Book("자바의 정석");
		
		
		System.out.println("책 제목은 " + bo.title);		// 내용 출력
		System.out.println("저자명은 " + bo.author);		// 내용 출력
		
		
	}
}

// 제목과 저자를 나타내는 title 과 author 필드를 가진 Book 클래스를 작성하고,
// 객체 배열을 만들어 책의 제목과 저자를 입력받아 내용을 출력하시오
