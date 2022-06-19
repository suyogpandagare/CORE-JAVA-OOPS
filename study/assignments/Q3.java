package study.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Q3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum=0;
		try {
		for(int i=0; i<args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]);
			list.add(Integer.parseInt(args[i]));
		}
		System.out.println("Sum = "+sum);
		
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("maximum no is = "+Collections.max(list));
		
		System.out.println("minimum no is = "+Collections.min(list));
		}
		catch (NumberFormatException e)
		{
		System.out.println("Enter integer arguments..");
		
		}
	}
}
