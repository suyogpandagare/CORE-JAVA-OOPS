package study.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {

		//ENTRY/INSERTION ORDERING
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		//SORTED INORDER
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		
		//HASHING ORDER
		HashSet<Integer> intg = new HashSet<Integer>();
		
		/*intg.add(12);
		intg.add(43);*/
		
		Collection<Integer> itg = Arrays.asList(32,23,4,334,5,44);
		intg.addAll(itg);
		
		
		for(Integer i : intg)
		{
			System.out.println(i);
		}
	}

}
