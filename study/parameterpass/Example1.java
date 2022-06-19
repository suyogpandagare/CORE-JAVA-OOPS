package study.parameterpass;

public class Example1 {

	public static void main(String[] args) {
		
		//If object is passed or returned address is copied
		MyWrapper x = new MyWrapper();
		x.value=23;
		System.out.println("before="+ x.value);
		increment(x);
		System.out.println("after="+ x.value);
	}

	public static void increment(MyWrapper x)
	{
		x.value++;
	}
	
	
}//end of class


class MyWrapper
{
	int value;
}