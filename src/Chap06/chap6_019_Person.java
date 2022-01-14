package Chap06;					// final 필드 선언과 초기화

public class chap6_019_Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public chap6_019_Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
