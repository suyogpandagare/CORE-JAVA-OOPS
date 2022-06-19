package study.isa;

public class TestAbstract {

	public static void main(String[] args) {

		//Globe obj = new Globe();  //abstract classes cant be instantiated means uska object nahi bana sakte
		Globe obj = new Earth();
		obj.f2();
	}

}//end of TestAbstract

abstract class Globe
{
	//concrete method : as it is having implementation
	void f1()
	{
		System.out.println("Good Morning");
	}
	//concrete method
	void f3()
	{
		System.out.println("good bye");
	}
	abstract void f2();
	abstract void f4();//this is abstract method its having no implementation
}
      
class Earth extends Globe
{

	@Override
	void f2() {
		System.out.println("hello");
	}

	@Override
	void f4() {
		System.out.println("hii");
	}
	
}

abstract class Moon extends Globe
{
	
}












