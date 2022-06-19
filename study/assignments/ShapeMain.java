package study.assignments;

public class ShapeMain {

	public static void main(String[] args) {

		Shape sq = new Square(5);
		sq.area();
		
		Shape tr = new Triangle(12, 15);
		tr.area();
		
		Shape re = new Rectangle(10, 15);
		re.area();
	}

}
