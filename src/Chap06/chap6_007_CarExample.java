package Chap06;					// 객체 생성 시 생성자 선택

public class chap6_007_CarExample {

	public static void main(String[] args) {
		chap6_007_Car car1 = new chap6_007_Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		chap6_007_Car car2 = new chap6_007_Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		chap6_007_Car car3 = new chap6_007_Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		chap6_007_Car car4 = new chap6_007_Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}

}
