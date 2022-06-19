package study.cpp.hw;

public abstract class Book {

	private String bName;
	private int ISBN_no;
	private String title;
	private String publisher;
	
	public Book()
	{
		this.bName = null;
		this.ISBN_no = 0;
		this.title = null;
		this.publisher = null;
	}
	
	public Book(String bn,int no, String t, String p)
	{
		this.bName = bn;
		this.ISBN_no = no;
		this.title = t;
		this.publisher = p;
	}
	
	public abstract void displayBookInfo();

	@Override
	public String toString() {
		return "Book [bName=" + bName + ", ISBN_no=" + ISBN_no + ", title=" + title + ", publisher=" + publisher + "]";
	}

	
	
}








