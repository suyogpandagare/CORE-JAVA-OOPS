package study.scopes;

public class Beta {

	public static void test1()
	{
		Alpha a1 = new Alpha();
//		//a1.data=200;            //not visible so check visibility scope //private data is not available outside the class
//		a1.data2=200;     //data2 is default scope so available in same package
//		a1.data3=200;   //data3 is public scope 
	
		//a1.show1();  //as the method is private the scope is limited to its class only so not visible in this class
		a1.show2();
		a1.show3();
	
	
	}                           
	
	
}
