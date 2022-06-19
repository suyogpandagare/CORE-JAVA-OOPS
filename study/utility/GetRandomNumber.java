package study.utility;

import java.util.Random;

public class GetRandomNumber {

	public static void main(String[] args) {

		Random random = new Random();   //1 is initial seed means kaha se start karna hai
		
		int x = random.nextInt(119);
		System.out.println("Next answer should be given by roll number "+x);
	}

}
