package study.cpp.hw;

import study.hasa.MyDate;

public class TemporaryMember extends Member {

	MyDate dueDate;

	public TemporaryMember(MyDate dueDate,String memberId, String name, int noOfArticles) {
		super(memberId,name,noOfArticles);
		this.dueDate = dueDate;
	}
	
	public void printMemberInfo()
	{
		super.printMemberInfo();
		System.out.println("TemporaryMember [dueDate=" + dueDate +"]");
	}

}
