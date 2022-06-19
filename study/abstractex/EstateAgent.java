package study.abstractex;

public class EstateAgent {

	public static void main(String[] args) {
//		showCostOfPlot(new Shape());  //nothing in Shape class
//		showCostOfPlot(new Circle(9));
		showCostOfPlot(new Rectangle(10, 5));
	
	
	}

	//Closed for Modification
	public static void showCostOfPlot(Shape shape)
	{
		final double PER_SQR_FT_COST = 3000;
		//double cost = 0;
		
		double cost = shape.area() * PER_SQR_FT_COST;
		
		/*if( shape instanceof Circle)
			cost  = ((Circle)shape).areaOfCircle()*PER_SQR_FT_COST;
	
		if( shape instanceof Rectangle)
			cost  = ((Rectangle)shape).areaOfRectangle()*PER_SQR_FT_COST;*/
	
	System.out.println("cost of plot is = "+ cost);
	
	}
}
