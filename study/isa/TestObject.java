package study.isa;

import java.awt.print.Book;

import study.SplitDemo;
import study.hasa.MyDate;
import study.hasa.TechnicalBook;

public class TestObject {

	public static void main(String[] args) {
		
		/*MyDate date = new MyDate();
		date.
		Employee e = new Employee();
	    e.
		Book b = new Book();
		b.*/
		
		/*MyDate d = new MyDate(12, 12, 2012);
		System.out.println(d);  //internally d.toString() is called
		
		System.out.println(new MyDate(13, 13, 2013));*/
		
		/*Employee e = new Employee(33, 25000, "Web Developer", "Sanket", new MyDate(13, 6, 1998));
		System.out.println(e);  */
		
		TechnicalBook tbook = new TechnicalBook("Core Java", 699, new MyDate(15, 18, 2022), new String[] {"ABCD","ADBC"});
		System.out.println(tbook);
		
	}

}
