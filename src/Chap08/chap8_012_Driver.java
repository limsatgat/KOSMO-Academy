package Chap08;					// ��ü Ÿ�� Ȯ��

public class chap8_012_Driver {
	public void drive(chap8_011_Vehicle vehicle) {
		if(vehicle instanceof chap8_011_Bus)	{
			chap8_011_Bus bus = (chap8_011_Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
