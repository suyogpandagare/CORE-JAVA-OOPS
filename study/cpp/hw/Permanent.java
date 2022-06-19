package study.cpp.hw;

public class Permanent extends Member{

	private float discountPercentage;

	
	public Permanent() {
		super();
		this.discountPercentage = 0;
	}

	public Permanent(float discountPercentage,String memberId, String name, int noOfArticles) {
		super(memberId,name,noOfArticles);
		this.discountPercentage = discountPercentage;
	}
	
	public void printMemberInfo()
	{
		super.printMemberInfo();
		System.out.println("Permanent [discountPercentage=" + discountPercentage );
	}
	
}
