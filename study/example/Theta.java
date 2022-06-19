package study.example;

public class Theta {

	public static void test2() 
	{
		Delta d1 = new Delta();
		//Delta d2 = new Delta("Suyog");  //as its is private so not visible in this class
		Delta d3 = new Delta(17);   //default is visible in this class as its accessible in same package
	}
}
