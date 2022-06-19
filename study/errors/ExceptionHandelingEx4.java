package study.errors;

import java.io.IOException;

public class ExceptionHandelingEx4 {

	public static void main(String[] args)  {  //IF MAIN METHOD ALSO THROWS EXCEPTION => PROGRAM CRASH AS MAIN IS SUPER IT MUST HANDEL IF NO SUBCLASS IS HANDELIG

		//showHeight(-8);
		f1();
	System.out.println("program ends properly");
		
	}
	
	public static void f1()     //f1 can either throw or it solve the problem
	{
		//now f1 is handeling the exception
		try {
			showHeight(-8);
		} catch (Exception e) {
         
			//YOU CAN GIVE ANY MESSAGE YOU WANT
			
			e.printStackTrace();
			//System.out.println(e);
			System.out.println("The height cannot be negative");
		}
	}
	
	public static void showHeight(int x) throws Exception    //AS WE KNOW THIS METHOD(showHeight) MAY THROW EXCEPTION WHEN X < 0 SO WE ARE ADDING THROWS DECLARATION
	{                                                        //AS THIS METHOD THROWS EXCEPTION ITS CALLER MUST IMPLEMENT CATCH OR PASS IT TO ITS SUPER 
		if(x > 0)  System.out.println("height of building = "+x);
		else
		{
			//WE WILL EXPLICITELY THROW EXCEPTION AS WE KNOW HEIGHT CANNOT BE < THAN 0
			Exception e = new Exception();
			throw e;      //THROW NEED AN OBJECT OF EXCEPTION I.W. WE ARE CREATING EXCEPTION OBJECT
		}
	}
	
	public static void showSquareNumber(String s)   //we can add throws but not done then also ok
	{
		int x = Integer.parseInt(s);   //compiler is not forcing to rethrow or catch AS PARSEINT THROWS NUMBERFORMATEXCEPTION WITH IS A RUNTIME EXCEPTION => UNCHECKED EXn.
		System.out.println(x*x);
	}
	
	public static void test()
	{
		//directly making throw object
		throw new ArithmeticException();   //here also compiler not forcing as it is unchecked => unchecked EXn.
	}
	
	public static void test2()
	{
		try {
			throw new IOException();    //as it is checked exception it forces to throws or catch
		} catch (IOException e) {       //checked exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
