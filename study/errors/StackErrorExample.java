package study.errors;

public class StackErrorExample {

	public static void main(String[] args) {

		f1();
	}
	
	//FOR STACKOVERFLOW => USING RECURSION
	public static void f1()
	{
		System.out.println("hii");
		f1();  //RECURSIVE CALL
	}

}


/*at study.errors.StackErrorExample.f1(StackErrorExample.java:14)
at study.errors.StackErrorExample.f1(StackErrorExample.java:14)
at study.errors.StackErrorExample.f1(StackErrorExample.java:14)
at study.errors.StackErrorExample.f1(StackErrorExample.java:14)
at study.errors.StackErrorExample.f1(StackErrorExample.java:14)
at study.errors.StackErrorExample.f1(StackErrorExample.java:14)
at study.errors.StackErrorExample.f1(StackErrorExample.java:14)
at study.errors.StackErrorExample.f1(StackErrorExample.java:14)
at study.errors.StackErrorExample.f1(StackErrorExample.java:14)*/