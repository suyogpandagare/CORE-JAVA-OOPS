package study.example;

public class Delta {

	public Delta()
	{
		System.out.println("This is no parameter constructor of Delta ");
	}
	
	private Delta(String name)
	{
		System.out.println("Helloo" + name);
	}
	
	//DEFAULT SCOPE
	Delta(int x) 
	{
		System.out.println("your number is: " + x);
	}
	
	public static void test1() 
	{
		Delta d1 = new Delta();
		Delta d2 = new Delta("Suyog");
		Delta d3 = new Delta(17);
	}
}
