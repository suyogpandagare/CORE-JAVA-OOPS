package study.isa;

import study.hasa.MyDate;
import study.hasa.TechnicalBook;

public class TestInheritance3 {

	public static void main(String[] args) {

		show(new Object());
		show(new MyDate());   //object sab ka super hai to koi bhi object pass kar sakte
		show(new Employee());
		show(40);  //AutoBoxing
		show(new TechnicalBook());
		show(new Person());
	}//end of main

	public static void show(Object obj)
	{
		String s = obj.toString();  //toString of object will get called
		System.out.println("s="+s);
	}
	
	
	
	
}
