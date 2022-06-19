package study.cpp.hw;

public class TextBook extends Book {

	private String author;
	
	public TextBook()
	{
		this.author = null;
	}
	
	

	public TextBook(String author,String bn,int no, String t, String p) {
		super(bn,no,t,p);
		this.author = author;
	}



	@Override
	public void displayBookInfo() {
		
		System.out.println("TextBook author=" + author + ", "+ super.toString());
	
	}
}
