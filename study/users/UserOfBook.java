package study.users;

import study.basics.Book;

public class UserOfBook {

	public static void main(String[] args) {

		//we call book class using PACKAGE QUALIFIED CLASS NAME
		//study.basics.Book firstBook = new study.basics.Book();
		Book firstBook= new Book();
		firstBook.setBookId(12);
		firstBook.setBookName("Learning Core Java");
		
		System.out.println(firstBook.getBookId() + " "+ firstBook.getBookName());
		
		//study.basics.Book secondBook = new study.basics.Book(13, "Principles of OOP");
		Book secondBook = new Book(13,"Principles of OOP");
		System.out.println(secondBook.getBookId()+ " " + secondBook.getBookName());
	}
       
}
