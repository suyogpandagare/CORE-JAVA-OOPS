package study.collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Admin {

	public static void main(String[] args) throws UnAuthorisedException {
		int choice;
		Scanner sc = new Scanner(System.in);

		Users user = new Users();

		do {
			System.out.println("--------------------------------------");
			System.out.println("Enter your choice: \n"
					+ "a. Login \n"
					+ "b. Sign Up \n"
					+ "c. Show all users \n"
					+ "d. Change password \n"
					+ "e. Remove user \n"
					+ "f. quit");
			System.out.println("--------------------------------------");

			choice = sc.next().charAt(0);
			switch(choice) {

			case 'a' : {

				Users.LogIn();
				break;
			}

			case 'b' : {

				Users.SignUp();
				break;
			}
			
			case 'c' : {

				Users.showAllUserNames();
				break;
			}

			case 'd' : {

				Users.changePasward();
				break;
			}

			case 'e' : {

				Users.removeEntry();

				break;
			}
		
			case 'f' : {
				System.out.println("Thank you...!!!");
				break;
			}
			}

		}while(choice != 'f');

	}//end of main

}//end of class