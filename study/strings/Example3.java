package study.strings;

public class Example3 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("hello");
		
		//MUTABLE StringBuffer
		sb1.append(" world");    //calling String(sb1) is getting changes here
		System.out.println(sb1);
		
		StringBuilder sbu1 = new StringBuilder("good");
		
		//MUTABLE StringBuilder
		sbu1.append(" morning");   //calling String(sbu1) is getting changes here
		System.out.println(sbu1);
		
		
		String s1 = new String("good");
		//IMMUTABLE String
		s1.concat(" afternoon");
		System.out.println(s1);   //calling String(s1) is not Changing
		
		
		
		
		
		
	}

}
