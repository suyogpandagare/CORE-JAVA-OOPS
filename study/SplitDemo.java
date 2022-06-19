package study;

import java.util.Scanner;

import study.hasa.MyDate;

public class SplitDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter comma seperated authors");
		String s = sc.nextLine();
		
		String [] authors = s.split(",");
		
		for(String author : authors)  //author is String object which point authors array
		{
			System.out.println(author);
		}
		
		System.out.println("Enter - seperated date dd-mm-yy");
		String date = sc.next();
		
		String [] dtarr =  date.split("-");
		
		MyDate d = new MyDate(Integer.parseInt(dtarr[0]),Integer.parseInt(dtarr[1]),Integer.parseInt(dtarr[2]));
		
		System.out.println(d.getDay()+"-"+d.getMonth()+"-"+d.getYear());
		
		
	}

}
