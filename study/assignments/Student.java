package study.assignments;

public class Student implements Comparable<Student>{

	private String studentName;
	private double Percentage;
	private int rollNo;
	private String address;
	
	public Student()
	{
		
	}

	public Student(String studentName, double percentage) {
		super();
		this.studentName = studentName;
		this.Percentage = percentage;
	}

	public Student(String studentName, double percentage, int rollNo, String address) {
		super();
		this.studentName = studentName;
		this.Percentage = percentage;
		this.rollNo = rollNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", Percentage=" + Percentage + ", rollNo=" + rollNo
				+ ", address=" + address + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getPercentage() {
		return Percentage;
	}

	public void setPercentage(double percentage) {
		Percentage = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Student o) {

		if(this.getPercentage() > o.getPercentage()) return 1;
		if(this.getPercentage() < o.getPercentage()) return -1;
		else
			return 0;
		
	}
	
	
	
	

}
