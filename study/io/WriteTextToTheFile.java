package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextToTheFile {

	public static void main(String[] args) throws FileNotFoundException{

		//the file is opening in ovverride mode
		//FileOutputStream fout = new FileOutputStream("E:\\OOPS\\poem.txt");
		
		//opening the file in append mode
		boolean append = true;
		FileOutputStream fout = new FileOutputStream("E:\\OOPS\\poem.txt",append);
		
		PrintWriter pw = new PrintWriter(fout);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("enter the String to copy in file");
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("quit"))    break;
		pw.println(input);
		pw.flush();   //buffer se HDD me  copy hota hai
		}
		
		pw.close();
		
		
	}

}
