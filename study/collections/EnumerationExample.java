package study.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("red");
		v.add("white");
		v.add("black");
		
		System.out.println("printing with enumeration..");
		Enumeration<String> enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		System.out.println();
		
		System.out.println("printing with iterator");
		Iterator<String> iter = v.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
