package study.errors;

public class ExceptionHandelingEx1 {

	//EXAMPLE OF TRY CATCH AND FINALLY
	public static void main(String[] args) {

		
		try {
			System.out.println(args[0].toUpperCase());
			System.out.println("line after problematic code");
		}
		catch(Exception e)  //Universal catch-it will match all the exceptiion as Exception is Base of all Exceptions
		{
			System.out.println(e);  //e is object of Exception and toString() of Exception will be called
		}
		
		finally
		{
			System.out.println("this code will always run");
		}
		
		System.out.println("out side try catch finally code ends properly");
	}

}
               