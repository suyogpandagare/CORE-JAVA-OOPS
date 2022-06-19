package study.isa;

import study.hasa.MyDate;   //MyDate is available is some other packege i.w. we are calling MyDate calss using its Packagr qualified class name

public class UserOfHierarchy {

	public static void main(String[] args) {

		Employee e1 = new Employee(13, 20000, "testing","Suyog",new MyDate(11, 11, 2011));
		//System.out.println(e1.getName()+ " "+e1.getDepartment());
		e1.show();
		
		/*Employee e = new Employee();
		
		//Employee Inhereted Methods
		//Employee has inherited setName,getName,setDOB,getDOB from person
		e.setName("Suyog");         //setter is not available in employee but as it extends person it inherited person
		e.setDob(new MyDate(17, 3, 1998));
		
		//Employee Own Methods
		e.setEmpId(12);
		e.setSalary(20000);
		e.setDepartment("developer");
		
		System.out.println("the name of employee is "+ e.getName());
		System.out.println("the employee's department = "+e.getDepartment());*/
	
	
	
	
	
	
	
	
	
	}

}
