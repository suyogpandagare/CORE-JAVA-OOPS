package study.utility;

import java.util.ArrayList;
import java.util.Scanner;

import study.hw.Address;

public class VarArgs {

	public static void main(String[] args) {

		/*add(12);
		add(12,12);
		add(12,12,12,12,12,12);
		add(new int[] {1,2,3,4,5,6});
		int []arr = new int [2];
		arr[0] = 12;
		arr[1] = 23;*/
		
		/*Scanner sc = new Scanner(System.in);
		String name = sc.next();*/
		ArrayList<Integer> s1 = new ArrayList<Integer>();
		s1.add(12);
		s1.add(23);
		
		for (Integer integer : s1) {
			System.out.println(integer);
		}
		
		
	}//end of main

	
	public static void add(int... a)
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
