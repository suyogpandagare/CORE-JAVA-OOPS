package study.users;

import java.util.Scanner;

import study.basics.maths.Calculator;

public class CalcUser {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		Calculator cal = new Calculator();
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();

		System.out.println("Enter your operator choice");

		System.out.println(" '+' for summation" + "\n"+
				" '-' for difference" + "\n"+
				" '*' for multiplication" + "\n"+
				" '/' for difference" + "\n"+
				" '%' for remainder" + "\n");

		System.out.println("Enter Char to Perform operation: ");
		char ch = sc.next().charAt(0);

		switch(ch)
		{
		case '+':{
			int sum = cal.calculate(num1, num2, ch);
			System.out.println(sum);
			break;
		}

		case '-':{
			int diff = cal.calculate(num1, num2, ch);
			System.out.println(diff);
			break;
		}

		case '*':{
			int mul = cal.calculate(num1, num2, ch);
			System.out.println(mul);
			break;
		}

		case '/':{
			int div = cal.calculate(num1, num2, ch);
			System.out.println(div);
			break;
		}

		case '%':{
			int mod = cal.calculate(num1, num2, ch);
			System.out.println(mod);
			break;
		}
		default:
			System.out.println("invalid operator");
			break;
		}

	}
}
