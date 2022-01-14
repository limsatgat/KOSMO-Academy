package Chap06;					// return 문

public class chap6_010_CarExample {

	public static void main(String[] args) {
		chap6_010_Car myCar = new chap6_010_Car();
		
		myCar.setGas(5);	//Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas();	// Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();	//Car의 run()메소드 호출
		}
		
		if(myCar.isLeftGas()) {		//Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
