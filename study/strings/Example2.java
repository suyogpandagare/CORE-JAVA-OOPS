package study.strings;

public class Example2 {

	public static void main(String[] args) {

		String str = "tuberose";
		
		
		String s2 = str.toUpperCase();
		
		System.out.println(str + " "+ s2);  //here str is same that proves Strings are immutable...so when we catch it in s2 using toUpperCase and its copy is used to print in UpperCase
		
		String h1 = "hello";
		String h2 = "world";
		String h3 = h1.concat(h2);
		
		System.out.println(h1+ " "+h2+ " "+h3);   //here also h1 and h2 Strings are same ==>they are immutable and copy of h1 and h2 is used in concat
		
		String s9 = "numbers are";
		for(int i=0; i<100; i++)
		{
			s9 = s9.concat(""+i);   //here everytime its creating new object of s9 so this is disadvantage of strings...bcz of this String class is not good idea to use
		}
		System.out.println(s9);
		
		
		
		
		
		
		
	}

}
