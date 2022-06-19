package study.isa;

import study.hasa.MyDate;

public class User3 {

	public static void main(String[] args) {

		PartTimeEmployee emp = new PartTimeEmployee(4,12,20000,"Developer","Suyog",new MyDate(17, 3, 1998));
		System.out.println(emp);
		System.out.println(emp.getName());
		System.out.println(emp.getDepartment());
		System.out.println(emp.getNumOfHours());
		
	}

}
