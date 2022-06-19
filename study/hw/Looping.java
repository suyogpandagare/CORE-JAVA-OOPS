package study.hw;

import java.util.Scanner;

public class Looping {
	static long balance;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the Balance Value: ");
		balance = sc.nextLong();

		System.out.println("Select Your Choice");
		System.out.println("1.Deposit");
		System.out.println("2.Withdrawl");
		System.out.println("3.Show Balance");
		System.out.println("4.Quit");
		int choice = sc.nextInt();

		switch(choice) {

		case 1: {
			System.out.println("Enter Amount To deposit");
			long depo = sc.nextLong();
			balance = depo + balance;
			System.out.println(balance);
			break;
		}

		case 2: {
			System.out.println("Enter Amount To Withdraw");
			long amt = sc.nextLong();

			if(balance <= 100)
			{
				System.out.println("Not Enough Balance");
				break;
			}
			else
			{
				balance = balance - amt;
				System.out.println(balance);
				break;
			}
		}

		case 3: {

			System.out.print("Your Account Balance Is = ");
			System.out.println(balance + "Rs.");
			break;
		}
		
		case 4: {
			System.out.println("Thank you");
			return;
		}
		}
	}

}
}