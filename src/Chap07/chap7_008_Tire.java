package Chap07;

public class chap7_008_Tire {
	//필드
	public int maxRotation;				//최대 회전 수(타이어 수명)
	public int accumulatedRotation;		//누적 회전 수
	public String location;				//타이어의 위치
	
	//생성자
	public chap7_008_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " chap7_008_Tire 수명: " +
							(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " chap7_008_Tire 펑크 ***");
			return false;
		}
			
	}
	
}
