package Chap06;					// 메소드 오버로딩

public class chap6_013_Calculator {
	//정사각형의 넓이
	double areaRectangle(double width)	{
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height)	{
		return width * height;
	}
}
