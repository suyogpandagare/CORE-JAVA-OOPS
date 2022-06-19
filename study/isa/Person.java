package study.isa;

import study.hasa.MyDate;

public class Person {

	private String name;
	private MyDate dob;
	
	public Person()
	{
		System.out.println("Person created");
		this.name = null;
		this.dob = null;
	}

	
	public Person(String name, MyDate dob) {
		super();
		this.name = name;
		this.dob = dob;
		//System.out.println("parameterised constructor of person");
	}

	public void show()
	{
		System.out.println(name+ " "+dob.getDay()+"-"+dob.getMonth()+"-"+dob.getYear());
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

	public void setDob(MyDate dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}
	
	
}
