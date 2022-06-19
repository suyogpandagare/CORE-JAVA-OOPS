package study.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		/*ts.add(23);
		ts.add(43);
		ts.add(12);*/
		
		Collection<Integer> ints = Arrays.asList(12,23,34,45,56,67);
		ts.addAll(ints);
		
		for(Integer i : ts)
		{
			System.out.println(i);  //TreeSet follows InOrder Traversal
		}
		
		
	}

}
