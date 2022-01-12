package Chap07;					// 실체 클래스

public class chap7_013_SmartPhone extends chap7_013_Phone {
	//생성자
	public chap7_013_SmartPhone(String owner) {
		super(owner);
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
