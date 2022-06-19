package study.cpp.hw;

public class EditedBook extends Book {

	private String editorName;
	private int noOfArticles;

	public EditedBook()
	{
		this.editorName = null;
		this.noOfArticles = 0;
	}

	public EditedBook(String editorName, int noOfArticles,String bn,int no, String t, String p) {
		super(bn,no,t,p);
		this.editorName = editorName;
		this.noOfArticles = noOfArticles;
	}

	@Override
	public void displayBookInfo() {
		System.out.println("EditedBook [editorName=" + editorName + ", noOfArticles=" + noOfArticles + super.toString()+"]");
		
	}

}
