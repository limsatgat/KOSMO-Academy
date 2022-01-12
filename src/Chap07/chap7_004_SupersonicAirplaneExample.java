package Chap07;

public class chap7_004_SupersonicAirplaneExample {

	public static void main(String[] args) {
		chap7_004_SupersonicAirplane sa = new chap7_004_SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = chap7_004_SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = chap7_004_SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
