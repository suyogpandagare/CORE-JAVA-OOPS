package study.isa;

import study.hasa.MyDate;

public class PartTimeEmployee extends Employee{

	private int numOfHours;
	
	public PartTimeEmployee()
	{
		
	}

	public PartTimeEmployee(int numOfHours,int eId,double s,String d,String nm,MyDate dob) {
		super(eId,s,d,nm,dob);
		this.numOfHours = numOfHours;
	}

	public int getNumOfHours() {
		return numOfHours;
	}

	public void setNumOfHours(int numOfHours) {
		this.numOfHours = numOfHours;
	}

	@Override
	public String toString() {
		
		 
		return (super.toString()+"PartTimeEmployee [numOfHours=" + numOfHours + "]");
	}

	
	
	
}
