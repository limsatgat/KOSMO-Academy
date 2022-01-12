package Chap07;					// 실행 클래스

public class chap7_009_Car2Example {
	public static void main(String[] args) {
		chap7_009_Car car = new chap7_009_Car();
		
		for(int i=1; i<=5; i++)	{
			int problemLocation = car.run();
			if(problemLocation != 0) {
				System.out.println(car.chap7_008_Tires[problemLocation-1].location + " HankookTire로 교체");
				car.chap7_008_Tires[problemLocation-1] =
						new chap7_008_HankookTire(car.chap7_008_Tires[problemLocation-1].location, 15);
			}
			System.out.println("-----------------------");
		}
	}
}
