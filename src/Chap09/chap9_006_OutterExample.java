package Chap09;					// 중첩 클래스에서 바깥 클래스 참조 얻기 실행 클래스

public class chap9_006_OutterExample {

	public static void main(String[] args) {
		chap9_006_Outter outter = new chap9_006_Outter();
		chap9_006_Outter.Nested nested = outter.new Nested();
		nested.print();

	}

}
