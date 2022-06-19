package study.errors;

public class ExceptionHandelingEx3 {

	//EXAMPLE OF TRY HAVING ONE CATCH WHICH IS CATCHING MULTIPLE EXCEPTIONS AND THE SUPER CLASS EXCEPTION MUST BE IN THE END WHEN SUBCLASS EXCEPTIONS ARE USED
	public static void main(String[] args) {

		try {
			System.out.println(args[0].toUpperCase());
			 //if args[1] or args[0] is not given we get ArrayIndexOutOfBoundException
			// //if args[1] is not an integer in String then NumberFormatException 
			int x = Integer.parseInt(args[1]); 
			int division = 100/x;    //If x is 0  we get Arithmatic Exception
			System.out.println(division);
			
			String []arr = new String [3];
			System.out.println(arr[0].toLowerCase()); //arr ALL ELEMENTS ARE NULL...I.W. WE WILL GET NULL POINTER EXCEPTION WHICH WE HAVE NOT HANDELED SO PROG CRASH
		}
		//shortcut for writting multiple catches
		catch(ArrayIndexOutOfBoundsException  | ArithmeticException | NumberFormatException e)  //WE ARE USING PIPE FOR HANDELING MULTIPLE EXCEPTIONS  
		{
			//toString OF e IS CALLED
			System.out.println("Catching "+e);
		}
		
		/*catch(Exception e)   //acting like sink that matches other than above 3 ..this is super class catch it must be in end 
		{
			//STACK METHODS ARE SHOWN WE ARE TRACING THE STACK
			e.printStackTrace();   
		}*/
		
		
		System.out.println("end of try catch block ,program ends properly");
	}
}
