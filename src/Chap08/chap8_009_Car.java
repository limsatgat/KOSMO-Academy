package Chap08;					// �ʵ� ������

public class chap8_009_Car {
	chap8_008_Tire[] tires = {
			new chap8_008_HankookTire(),
			new chap8_008_HankookTire(),
			new chap8_008_HankookTire(),
			new chap8_008_HankookTire()
	};
	
	void run()	{
		for(chap8_008_Tire tire : tires)	{
			tire.roll();
		}
	}
}
