package study.utility;

public class EqualsExample {

	public static void main(String[] args) {

		Dummy2 obj1 = new Dummy2(12,"Suyog");
		Dummy2 obj2 = new Dummy2(12,"Suyog");
		//Dummy2 obj2 = obj1;
		
		System.out.println("Equals resut ="+obj1.equals(obj2));
		System.out.println("hashcode of obj1 "+obj1.hashCode());
		System.out.println("hashcode of obj2 "+obj2.hashCode());
		
	}

}//end of class

class Dummy2
{
	private int rollNO;
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		Dummy2 temp = (Dummy2)obj;
		if(temp.rollNO==this.rollNO && temp.name.equals(this.name))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {

		 return rollNO;  //according to rules rollno are unique;
	}
	
	
	public Dummy2(int rollNO, String name) {
		super();
		this.rollNO = rollNO;
		this.name = name;
	}
	
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
