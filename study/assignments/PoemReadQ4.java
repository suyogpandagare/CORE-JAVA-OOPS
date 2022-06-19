package study.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PoemReadQ4 {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fin = new FileInputStream("E:\\OOPS\\poem1.txt");
		
		Scanner sc = new Scanner(fin);
		
		ArrayList<String> poem = new ArrayList<String>();
		
		while(sc.hasNext())
		{
			String line = sc.nextLine();
			poem.add(line);
		}
		Iterator<String> itr = poem.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
