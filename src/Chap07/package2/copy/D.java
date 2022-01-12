package Chap07.package2.copy;					// protected 접근 제한자

import	Chap07.package1.A;

public class D extends A {
	public D()	{
		super();
		this.field = "value";
		this.method();
	}
}
