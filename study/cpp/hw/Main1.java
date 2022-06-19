package study.cpp.hw;

import study.hasa.MyDate;

public class Main1 {

	public static void main(String[] args) {

		Member m1 = new Permanent(40, "A11", "Suyog", 5);
		m1.printMemberInfo();
		
		Member m2 = new TemporaryMember(new MyDate(11, 12, 2012), "B301", "AAAAA", 10);
		m2.printMemberInfo();
	}

}
