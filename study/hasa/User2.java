package study.hasa;

import java.util.Scanner;

public class User2 {

	public static void main(String[] args) {

		//accept values from the user and create 3 TechnicalBooks 
		
		TechnicalBook [] books = new TechnicalBook[3];//sirf array bana hai 3 no me null hai abhi
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter book name");
			String name = sc.nextLine();
			
			System.out.println("Enter cost");
			int c = sc.nextInt();
			
			System.out.println("Enter day");
			int day = sc.nextInt();
			
			System.out.println("Enter day");
			int month = sc.nextInt();
			
			System.out.println("Enter day");
			int year = sc.nextInt();
			
			MyDate tmp = new MyDate(day, month, year);  //created a date
			
			System.out.println("Enter how many authors");
			int n = sc.nextInt();
			
			sc.nextLine();
			String []authors = new String[n];
			
			for(int j=0; j<n; j++)
			{
				System.out.println("enter authors");
				authors[j] = sc.nextLine();
			}
			
			books[i] = new TechnicalBook(name,c,tmp,authors);
			
//			TechnicalBook tmp = new TechnicalBook();
//			tmp.setBookName(name);
//			tmp.setCost(c);
//			
//			books[i] = tmp;
			
			sc.nextLine();  //this is consuming any extra new line enter ke wajha se jo aaiyega usko kha jana hai islea ye line dal rahe
			
		}
		
		//har boook ka element tb me aayega aur usko fir print kr rahe
		for(TechnicalBook tb : books)  //for each technical book tb in books 
		{
			System.out.print(tb.getBookName() + " " + tb.getCost()+ " "+ tb.getDateOfPublication().getYear()+ " ");
			
			for(String s : tb.getAuthors())
			{
				System.out.print(s+ " ");
			}
			System.out.println();
		}
		
	}

}










