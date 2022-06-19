package study.scopes;

public class Alpha {      //alpha class is public so we can create Alpha object in any class and package

	private int data;
	int data2;        //default scope no access specifier used
	public int data3;
	
	private void show1()
	{
		System.out.println("hellow");
	}
	
	void show2()   //default scope
	{
		System.out.println("hellow");
	}
	
	public void show3()
	{
		System.out.println("hellow");
	}
	
	public static void test0()

	{
		Alpha obj = new Alpha();   //we are able to create object as it is public
//		obj.data=300;           //setting value of property //no error as we are accessing in same class
//		obj.data2=300;
//		obj.data3=300;
		
		obj.show1();
		obj.show2();
		obj.show3();
		
		
	}
	
}
//private - only in same class
//default scope - same package
//public scope - all class and packages