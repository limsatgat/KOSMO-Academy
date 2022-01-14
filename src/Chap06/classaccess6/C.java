package Chap06.classaccess6;					// 필드와 메소드의 접근 제한

import Chap06.classaccess5.A;

public class C {
	public C()	{
		A a = new A();
		a.field1 = 1;
		// a.field2 = 1;
		// a.field3 = 1;
		
		a.method1();
		// a.method2();
		// a.method3();
	}
}
