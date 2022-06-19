package study.assignments;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PoemWriteQ4 {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fout = new FileOutputStream("E:\\OOPS\\poem1.txt",true);
		PrintWriter pw = new PrintWriter(fout);
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Enter Lines to add in file: ");
			System.out.println("Enter quit to exit: ");
			String input = sc.nextLine();

			if(input.equalsIgnoreCase("quit"))
			{
				break;
			}
			else
				pw.println(input);
			    pw.flush();
		}
		pw.close();
		
	}

}
