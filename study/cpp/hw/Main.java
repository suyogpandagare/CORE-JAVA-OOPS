package study.cpp.hw;

public class Main {

	public static void main(String[] args) {

		Book b = new TextBook("Suyog", "Let's java", 2002, "Java", "Shreyash");
		b.displayBookInfo();
		
		 b = new EditedBook("Sheryash", 5, "C", 3030, "Learn C", "Suyog");
		 b.displayBookInfo();
		
	}

}
