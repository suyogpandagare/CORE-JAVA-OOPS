package study.strings;

public class Example1 {

	public static void main(String[] args) {

		String s1 = "Hello"; //this is in constant pool
		//String s2 = "Hello"; //this is also in constant pool
		String s2 = new String("Hello");  //this is not in constant pool so it will create new object on heap
		
		//use == to compare the address int the String reference
		if(s1 == s2)  //object ko == use kia to address compare hote
		{
			System.out.println("both s1 and s2 point to same object");
		}
		else
			System.out.println("both s1 and s2 point to different object");
	}

}
