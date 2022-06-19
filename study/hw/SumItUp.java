package study.hw;

import java.util.Scanner;

public class SumItUp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter comma sepeated numbers:");
		String numb = sc.next();
		String[] num = numb.split(",");
		
		int sum = 0;
		for(String n : num)
		{
			sum = sum + Integer.parseInt(n);
		}
		System.out.println(sum);
	}

}
