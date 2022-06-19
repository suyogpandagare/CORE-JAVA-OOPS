package study.isa;

import study.hasa.MyDate;

public class User2 {

	public static void main(String[] args) {

		Patient p = new Patient("O+", "55 mm of Hg", 172,"Suyog",new MyDate(17, 3, 1998));
		System.out.println(p);
	
		System.out.println(p.getName());
		System.out.println(p.getBloodPressure());
	}

}
