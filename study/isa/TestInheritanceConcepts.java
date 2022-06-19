package study.isa;

public class TestInheritanceConcepts {

	public static void main(String[] args) {

		/*Alpha obj = new Alpha();
		Beta obj1 = new Beta();
		Theta obj2 = new Theta();
		Gamma obj3 = new Gamma();
		Delta obj4 = new Delta();
		dojob1(obj1);*/
		//dojob3(obj);  //bcz Alpha is not a sub class of Theta

		//		obj.fa();
		//		obj.fb();
		//		obj.fc();
		//		obj.fd();

		/*dojob1(new Alpha());
		dojob1(new Beta());  //same as Alpha obj = new Beta();  so beta is a subclass of Alpha
		dojob1(new Theta());  //Alpha obj = new Theta();
		dojob1(new Gamma());  //Alpha obj = new Gamma();
		dojob1(new Delta());*/  //Alpha obj = new Delta();

		/*dojob2(new Beta());  
		dojob2(new Theta());
		dojob2(new Gamma());
		dojob2(new Delta()); */ //Beta obj = new Delta();

//		dojob4(new Gamma());

//		dojob3(new Theta());
//		dojob3(new Gamma());

//		dojob5(new Delta());

		Alpha obj = new Beta();
		//obj.f1();
		((Theta)obj).fb();
		/*Delta obj = new Delta();
		((Theta)obj).fc();
		Alpha obj = new Gamma();
		((Beta)obj).fb();*/
     
	}//end of main

	public static void dojob1(Alpha obj)
	{
		obj.fa();  // obj Alpha ka hoga to sirf fa() call ho sakta
	}
	public static void dojob2(Beta obj)
	{
		obj.fa();   // obj Beta ka hoga to  fa() ,fb() call ho sakta
		obj.fb();
	}
	public static void dojob3(Theta obj)
	{
		obj.fa();   
		obj.fb(); // obj Theta ka hoga to sirf fa() fb() fc() call ho sakta
		obj.fc();
	}
	public static void dojob4(Gamma obj)
	{
		obj.fa();
		obj.fb();    // obj Gamma ka hoga to sirf fa()  fb() fc() fd() call ho sakta
		obj.fc();
		obj.fd();
	}
	public static void dojob5(Delta obj)
	{
		obj.fa();
		obj.fb();
	}

}//end of class

class Alpha
{
	void fa()   //no need of public as it is in same classs
	{
		System.out.println("Alpha");
	}

	void f1()
	{
		System.out.println("f1 of Alpha");	
	}

}
class Beta extends Alpha
{
	void fb()
	{
		System.out.println("Beta");
	}
	void f1()
	{
		System.out.println("f1 of Beta");	
	}
	

}
class Theta extends Beta
{
	void fc()
	{
		System.out.println("Theta");
	}

	void f1()
	{
		System.out.println("f1 of Theta");	
	}
	
}

class Gamma extends Theta
{
	void fd()
	{
		System.out.println("Gamma");
	}

	void f1()
	{
		System.out.println("f1 of Gamma");	
	}
	
}
class Delta extends Beta
{

}





