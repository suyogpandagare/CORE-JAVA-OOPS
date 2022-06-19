package study.cpp.hw;

public class Member {

	private String memberId;
	private String name;
	private int noOfArticles;
	
	public Member()
	{
		this.memberId = null;
		this.name = null;
		this.noOfArticles = 0;
	}

	public Member(String memberId, String name, int noOfArticles) {
		this.memberId = memberId;
		this.name = name;
		this.noOfArticles = noOfArticles;
	}
	
	public void printMemberInfo()
	{
		System.out.println("Member [memberId=" + this.memberId + ", name=" + this.name + ", noOfArticles=" + this.noOfArticles + "]");
	}
	
	
}
