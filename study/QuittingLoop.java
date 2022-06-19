package study;

import java.util.Scanner;

public class QuittingLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag)   //when we dont know kitne bar run hone wala hai
		{
			System.out.println("1.continue \n 2.quit ");
			int choice = sc.nextInt();
			
			if(choice == 2)
//				break;  //u come out of loop
//			System.exit(0);  //this terminate program
//				flag = false;
			return;   //just return dont say return 0 bcz return type is void
				
		}
	}

}
