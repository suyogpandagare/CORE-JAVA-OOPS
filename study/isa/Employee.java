package study.isa;

import study.hasa.MyDate;

//IS A relation Employee isa sub class of person
public class Employee extends Person implements Comparable<Employee>{     //relation goes from child not from parent

	private int empId;      //Employee's own properties
	private double salary;
	private String department;

	public Employee()
	{
		super();
		this.empId=0;
		this.salary=2000;
		this.department="testing";
		System.out.println("Employee created");
	}



	public Employee(int empId, double salary, String department,String n, MyDate dob) {
		super(n,dob);  //calling parameterised constructor of parent from child
		this.empId = empId;
		this.salary = salary;
		this.department = department;
		//System.out.println("parameterised constructor of Employee");
	}

	@Override
		public boolean equals(Object obj) {

		if(obj instanceof Employee)
		{
			Employee tmp = (Employee)obj;
			
			if(this.empId == tmp.empId && 
				this.salary == tmp.salary &&
				this.department.equals(tmp.department)&&
				this.getName().equals(tmp.getName()) &&
				this.getDob().equals(tmp.getDob()))
			
				return true;
			else
				return false;
			
		}
		else
			return false;
	
	
	}
	public void show()
	{
		//super.show();
		System.out.println(empId+" "+salary+" "+department);
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return (super.toString()+"Employee [empId=" + empId + ", salary=" + salary + ", department=" + department + "]\n");
	}



	@Override
	public int compareTo(Employee o) {

		if(this.empId > o.empId) return 1;
		if(this.empId < o.empId) return -1;
		else
		return 0;
	}


}
