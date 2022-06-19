package study.assignments;

public abstract class Shape {

	abstract void area();
	
}//end

class Square extends Shape{

	int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}


	@Override
	void area() {

		System.out.println("area of square is = "+(side*side));
	}
	
	
}//end

class Triangle extends Shape{

	int base,height;
	
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}


	@Override
	void area() {

		System.out.println("area of Triangle = "+(base*height)/2);
	}
	
	
}//end

class Rectangle extends Shape{

	int length,breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	void area() {

		System.out.println("area of Rectangle = "+(length*breadth));
	}
	
	
}//end
