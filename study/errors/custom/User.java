package study.errors.custom;

import study.hasa.MyDate;

public class User {

	public static void main(String[] args) {

		Employee1 e = new Employee1();
		e.setDept("Developer");
		e.setName("Suyog");
		//AS BOTH UNSER18 AND ABOVE70 EXCEPTIONS ARE NOT HANDELED SO IT MUST BE HANDELED HERE OR PROGRAM WILL  CRASH
		try {
			e.setDob(new MyDate(12, 12, 2012));
			System.out.println("date updated successfully");
		} catch (Under18Exception e1) {
			// TODO Auto-generated catch block
			
			e1.printStackTrace();
		}
		catch(Above70Exception e2)
		{
			e2.printStackTrace();
		}
		System.out.println("Code run successfully");
		
	}

}
