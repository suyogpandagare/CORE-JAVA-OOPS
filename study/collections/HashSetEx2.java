package study.collections;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {

		HashSet<Dummy> ts = new HashSet<Dummy>();
		ts.add(new Dummy(12, "Suyog"));
		ts.add(new Dummy(22, "Shreyash"));
		ts.add(new Dummy(43, "Mandar"));
		ts.add(new Dummy(1, "Prabhu"));
	
		for(Dummy d : ts)
		{
			System.out.println(d);
		}
	
	}

}
