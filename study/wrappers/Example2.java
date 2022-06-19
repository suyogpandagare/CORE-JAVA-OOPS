package study.wrappers;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

//		System.out.println("byte datatype range is "+ Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
//
//		System.out.println("long datatype range is"+ Long.MIN_VALUE+"to "+ Long.MAX_VALUE);
//
//		System.out.println("float datatype range is"+ Float.MIN_VALUE+"to "+ Float.MAX_VALUE);
//
//		System.out.println("integer datatype range is"+ Integer.MIN_VALUE+"to "+ Integer.MAX_VALUE);
//
//		System.out.println("short datatype range is"+ Short.MIN_VALUE+"to "+ Short.MAX_VALUE);
//
//		System.out.println("double datatype range is"+ Double.MIN_VALUE+"to "+ Double.MAX_VALUE);
//
//		String s = "34.56";
//		//extract the double value from the string, we will use utility method parseDoble from Double class
//		double sum = Double.parseDouble(s) + 3.2;
//		System.out.println(sum);
//
//		String s1 = "true";
//		if(Boolean.parseBoolean(s1))   //solve this using utility method parse boolean from Boolean wrapper class
//			System.out.println("hi");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String name");
		String str = sc.next();
		//I want to print all characters that are in uppercase in the above String
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))   //use utility method isUppercase from Character wrapper class
			System.out.println(ch);           //isUpperCase is static methos i.w. calling it by class name
		}

	}
}
