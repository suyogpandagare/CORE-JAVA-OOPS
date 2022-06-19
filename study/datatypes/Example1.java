package study.datatypes;

import java.util.Scanner;

public class Example1 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//testByte();
		//testShort();
		//testFloat();
		//testInt();
		//testFloat();
		//testLong();
		//testDouble();
		testChar();
		//testBoolean();

	}//end of main

	public static void testByte()
	{
		byte x = 13;
		//byte y = 200;   //(-128 to 127)error bcz value is out of range


		System.out.println("Enter a byte value:");
		byte b = sc.nextByte();
		System.out.println("You entere "+ b);
	}

	public static void testShort()
	{
		//short a1 = 200;
		//short a2 = 10000000;  //out of range

		System.out.println("Enter a short value:");
		short b = sc.nextShort();
		System.out.println("You entere "+ b);
	}

	public static void testInt()
	{
		System.out.println("Enter a int value:");
		int b = sc.nextInt();
		System.out.println("You entere "+ b);
	}

	public static void testLong()
	{
		long l1 = 12312312312314444L;
		System.out.println("Enter a long value:");
		long b = sc.nextLong();
		System.out.println("You entere "+ b);
	}

	public static void testFloat()
	{
		float f1 = 24.5f;
		//float f2 = 55.6;    //default decimal point number is double to use it as float use f literal
		System.out.println("Enter a float value:");
		float b = sc.nextFloat();
		System.out.println("You entere "+ b);
	}

	public static void testDouble()
	{
		double d1 = 312313123.33d;
		System.out.println("Enter a short value:");
		double b = sc.nextDouble();
		System.out.println("You entere "+ b);
	}

	public static void testChar()
	{
		char ch = 'a';
		char ch1 = '4';
		char ch2 = '+';
		//char ch2 = '12';   //we added 2 char in single quotes so error

		System.out.println("Enter a character ");
		String s = sc.next();
		char input = s.charAt(0);  //extract character from string
		System.out.println("You entered "+ input);
	}

	public static void testBoolean()
	{
		//boolean flag = 0;  //NA
		boolean flag = true;
		System.out.println("Enter a boolean");
		boolean b = sc.nextBoolean();
		System.out.println("You entered "+ b);
	}

}//end of class
