package study.errors.custom;

import study.hasa.MyDate;

public class Employee1 {

	private String dept,name;
	private MyDate dob;
	
	public Employee1()
	{
		
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) throws Under18Exception  {
		if((2022 - dob.getYear()) >= 18)
		{
			if((2022 - dob.getYear()) >=70)
			{
				throw new Above70Exception(); //as it is unchecked exception it is not forcing me to handel it here or throws to super
			}
			else
				this.dob = dob;
		}
		else
		{
			throw new Under18Exception();  //as it is checked exception it will force me to handel it here or throws to super
		}
		
		
		
		
		
	}
	
	
}
