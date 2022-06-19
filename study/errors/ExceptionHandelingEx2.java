package study.errors;

public class ExceptionHandelingEx2 {

	//EXAMPLE OF TRY WITH MULTIPLE CATCH
	public static void main(String[] args) {

		try {
			System.out.println(args[0].toUpperCase());
			 //if args[1] or args[0] is not given => we get ArrayIndexOutOfBoundException
			// //if args[1] is not an integer in String => then we get NumberFormatException 
			int x = Integer.parseInt(args[1]); 
			int division = 100/x;    //If x is 0  => we get Arithmatic Exception
			System.out.println(division);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//CUSTOM MESSAGES
			System.out.println("you did not give enough command line args");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("you cannot divide by 0");
		}
		catch(NumberFormatException nfe)   //we get this error when 2nd argument is not given a number 
		{
			System.out.println("the arg 1 must be a number");
		}
		
		System.out.println("end of try catch block ,program ends properly");
	}

}
