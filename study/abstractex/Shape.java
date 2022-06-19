
package study.abstractex;

public abstract class Shape {

	abstract double area();    //this is generalised class so we have no area here as we dont know  
	
	
}

 class Circle extends Shape
{
	double radius;
	
	Circle(double r)
	{
		radius  = r;
	}
	double areaOfCircle()
	{
		final double pi = 3.14;
		double area = pi * radius * radius;
		return area;
	}
	@Override
	double area() {

		return areaOfCircle();
	}
}

class Rectangle extends Shape
{
	double length,breadth;
	
	Rectangle(double l, double b)
	{
		length = l;
		breadth = b;
	}
	
	double areaOfRectangle() {
		double area = length * breadth;
		return area;
	}

	@Override
	double area() {

		return areaOfRectangle();
	}
	
}