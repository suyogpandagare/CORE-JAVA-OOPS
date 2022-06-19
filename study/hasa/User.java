package study.hasa;

public class User {

	public static void main(String[] args) {

		TechnicalBook b1 = new TechnicalBook();
		
		b1.setBookName("Core Java Unplugged");
		b1.setCost(400);
		b1.setDateOfPublication(new MyDate(12,12,2012));
		b1.setAuthors(new String[] {"prachi","janbhi","shrinivas"});
		
		
		
		TechnicalBook b2 = new TechnicalBook("Thinking in Java",500,new MyDate(11,11,2011),new String[] {"suyog","shubham","amit","amol"});
		
		System.out.println("year of publication of b1 = " + b1.getDateOfPublication().getYear());
		System.out.println("Total authors of b2 = " + b2.getAuthors().length);
		System.out.println("Total cost of both books = " + (b1.getCost()+b2.getCost()));
		
		
		
		
	}

}
