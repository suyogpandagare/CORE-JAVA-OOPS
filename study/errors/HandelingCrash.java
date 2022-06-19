package study.errors;

import java.util.Scanner;

public class HandelingCrash {

	/*WHEN WE DONT USE TRY AND CATCH THE MOMENT USER ENTERS 
	0 THE PROGRAM CRASHES..TO HANDLE CRASH WE USE TRY-CATCH BLOCK*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divident");
		int divident = sc.nextInt();
		
		System.out.println("Enter divisor");
		int divisor = sc.nextInt();
		
		//TRY TO RUN THE PROBLEMATIC CODE HERE
		try {
			int division = divident / divisor;
			System.out.println("Division is = "+division);
		}
		
		//IF USER ENTERS DIVISOR 0 THEN IT IS ARITHMATIC EXCEPTION
		catch (ArithmeticException e) {
			//handeling exception in try
			System.out.println("DIVISOR CANNOT BE 0");
		}
		
		System.out.println("program ends properly");
	}

}
