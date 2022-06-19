package study.hw;

public class StudentNames {

	String[] names;
	static int cnt=0;
	
	public StudentNames()
	{
		names = new String[5];
	}

	public StudentNames(String[] names) {
		
		this.names = names;
	}
	
	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public void addName(String name)
	{
		 this.names[cnt] = name;
		 cnt++;
	}
	
	public void getNameOnIndex(int index)
	{
		System.out.println("The student at index "+ index +" is " + names[index]);
	}
	
	public void showAllNames()
	{
		for(String name : names)
		{
			System.out.println(name);
		}
	}
}
