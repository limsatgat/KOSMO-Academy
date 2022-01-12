package Chap07;					// 강제 타입 변환 (캐스팅)


public class chap7_011_ChildExample {

	public static void main(String[] args) {
		chap7_011_Parent parent = new chap7_011_Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.field2 = "data2";
		 parent.method3();
		 */
		
		chap7_011_Child child = (chap7_011_Child) parent;
		child.field2 = "yyy";	//가능
		child.method3();		//가능
	}

}

