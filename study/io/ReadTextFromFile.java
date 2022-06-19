package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFromFile {

	public static void main(String[] args) throws FileNotFoundException{

		FileInputStream fin = new FileInputStream("E:\\OOPS\\poem.txt");
		
		Scanner sc = new Scanner(fin);   //System.in kia to keyboard se input lega file se nahi jisko hum read krna chate
		
		while(sc.hasNextLine())
		{
			String filedata = sc.nextLine();
			System.out.println(filedata);
		}
		
		
	}

}
