package study.isa;

import study.hasa.MyDate;
import study.hasa.TechnicalBook;

public class TestEquals {

	public static void main(String[] args) {

		/*MyDate birthdayOfJeetu = new MyDate(12,12,2012);
		//MyDate birthDayOfNeetu = birthdayOfJeetu;
		//MyDate birthDayOfNeetu = new MyDate(1, 1, 2001);
		MyDate birthDayOfNeetu = new MyDate(12, 12, 2012);  //address compare hua
		
		
		if(birthdayOfJeetu.equals(birthDayOfNeetu))   //object ka equals method reuse kr rahe
		{
			System.out.println(birthdayOfJeetu+" is same as "+birthDayOfNeetu);
		}
		else
			System.out.println(birthdayOfJeetu+" is different from "+birthDayOfNeetu);*/
		
	
	/*TechnicalBook tb1 = new TechnicalBook("Core Java", 300, new MyDate(12, 12, 2012), new String[] {"AAA","BBB"});
	TechnicalBook tb2 = new TechnicalBook("Core Java", 300, new MyDate(12, 12, 2012), new String[] {"AAA","BBB"});
	
	if(tb1.equals(tb2))
		System.out.println("same");
	else
		System.out.println("not same");*/
		
		/*Patient p1 = new Patient("O+", "66 mm of Hg", 170, "Suyog", new MyDate(12, 5, 2022));
		Patient p2 = new Patient("O+", "66 mm of Hg", 170, "Suyog", new MyDate(12, 5, 2022));
		
		if(p1.equals(p2))
		{
			System.out.println("same");
		}
		else
			System.out.println("not same");*/
		
	Employee e1 = new Employee(12, 20000, "Tester", "Suyog", new MyDate(12, 5, 2022));
	Employee e2 = new Employee(12, 20000, "Tester", "Suyog", new MyDate(12, 5, 2022));
	
		if(e1.equals(e2))
		{
			System.out.println("same");
		}
		else
			System.out.println("not same");
		
		
		
		
		
		

}//end of main
	
}//end of class