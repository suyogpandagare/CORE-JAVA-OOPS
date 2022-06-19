package study;

import java.util.Scanner;

public class DlimiterExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		int num = sc.nextInt();
		//String s = sc.next();  //Dlimiter is space so space is not included
		sc.nextLine();
		String s1 = sc.nextLine(); //Dlimiter is new line so includes spaces
		System.out.println(s1);
	}

}
