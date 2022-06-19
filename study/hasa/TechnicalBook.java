package study.hasa;

import java.util.Arrays;

public class TechnicalBook {

	private String bookName;
	private int cost;

	//Has-A reference of another class of MyDate
	private MyDate dateOfPublication;
	//Has-A reference of Array
	private String [] authors;

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof TechnicalBook)
		{
			TechnicalBook tmp = (TechnicalBook)obj;
			
			
			if(this.bookName.equals(tmp.bookName)
					&& this.cost == tmp.cost
					&& this.dateOfPublication.equals(tmp.dateOfPublication)
					&&  this.compareAuthors(tmp.authors))                                        //Arrays.deepEquals(this.authors, tmp.authors))

				return true;
			else
				return false;
		}
		return false;
	}

	public TechnicalBook()
	{

	}

	public TechnicalBook(String bname, int cost, MyDate dop, String []aut)
	{
		this.bookName = bname;
		this.cost = cost;
		this.dateOfPublication = dop;
		this.authors = aut;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public MyDate getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(MyDate dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "TechnicalBook [bookName=" + bookName + ", cost=" + cost + ", dateOfPublication=" + dateOfPublication
				+ ", authors=" + Arrays.toString(authors) + "]";
	}

	private boolean compareAuthors(String[]authors2)
	{
		if(this.authors.length == authors2.length)
		{
			for(int i=0; i<this.authors.length;i++)
			{
				if(! this.authors[i].equals(authors2[i]))
					return false;
			}
			return true;
		}
		else
			return false;
	}

}
