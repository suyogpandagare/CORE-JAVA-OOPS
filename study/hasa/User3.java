package study.hasa;

import java.util.Scanner;

public class User3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			MyDate tmp = new MyDate();  //created a date
			System.out.println("Enter a - seperated date: ");
			String s = sc.nextLine();
			
			String [] date = s.split("-");
			MyDate d = new MyDate(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
			
			System.out.println(d.getDay()+"-"+d.getMonth()+"-"+d.getYear());
			
			System.out.println("Enter authors");
			String n = sc.nextLine();
			
			String [] nm = n.split(" ");
			for(String nme : nm)
			{
			    System.out.println(nme);
			}
			sc.nextLine();
	
		}
		
}












