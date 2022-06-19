package study.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import study.hasa.MyDate;

public class DateList {

	public static void main(String[] args) {

		ArrayList<MyDate> a1 = new ArrayList<MyDate>();
		a1.add(new MyDate(1, 2, 2000));
		a1.add(new MyDate(2, 3, 2012));
		a1.add(new MyDate(1, 2, 2005));
		a1.add(new MyDate(1, 2, 2009));
		a1.add(new MyDate(1, 2, 2007));
		a1.add(new MyDate(1, 2, 2020));
		
		
		show(a1);
		System.out.println();
		Collections.sort(a1);
		show(a1);
		
		
		
	}//end of main

	public static void show(List<MyDate> list)
	{
		
		Iterator<MyDate> iter = list.iterator();
	
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	
	}
	
}
