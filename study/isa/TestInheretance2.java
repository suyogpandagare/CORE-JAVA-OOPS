package study.isa;

public class TestInheretance2 {

	public static void main(String[] args) {
		
		/*Alpha obj = new Beta();  //compile time type of obj is Alpha
		obj.fa();
		obj.f1();//f1 of beta will be called as run time type is Beta
*/		
		/*Beta obj1 = new Theta();  //run time me theta hai i.w. f1 of theta will be called
		obj1.fa();
		obj1.fb();
		obj1.f1();
		*/
		
		test(new Beta());
		test(new Alpha());
		test(new Theta());
		test(new Gamma());
		test(new Delta());
		
		
	}//end of main
	
	//Passing base class - allows all objects of the hierarchy to be passed
	public static void test(Alpha obj)  //Alpha is compile time but run time pe Beta obj aane wala hai
	{
		obj.f1();
		obj.fa();
		if(obj instanceof Beta)   //if obj is instance of Beta then only allow  (object ko instance bolte)so Alpha is not Beta tab if statement run nahi hoga
		((Beta)obj).fb();  //as fb() is undefined type i.w. we type cast it into Beta so we r downcasting it
		
	
	}
}
