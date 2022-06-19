package study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import study.hasa.MyDate;


public class PersonSortExample {

	public static void main(String[] args) {

		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("Suyog", new MyDate(1, 3, 1998)));
		al.add(new Person("Abhi", new MyDate(1, 3, 2012)));
		al.add(new Person("Shreyash", new MyDate(1, 3, 1996)));
		al.add(new Person("Himu", new MyDate(1, 3, 2022)));
		al.add(new Person("Sonali", new MyDate(1, 3, 1950)));

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter 1 for default ordering\n"
				+ "Enter 2 for date ordering");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			//SORTING BY NAME
			Collections.sort(al);   //default way or ordering 
		}
		else
		{
			//SORTING BY DATE
			Collections.sort(al, new DobComparator()); //another way of ordering
		}	
			
		//PRINTING USING FOREACH LOOP
		for (Person person : al) {
			System.out.println(person.getName()+" - "+person.getDate());
		}
		System.out.println();
		
		//PRINTING USING ITERATOR FUNCTION IN LIST
		show(al);


	}//end of main

	public static void show(List<Person> list)
	{

		Iterator<Person> iter = list.iterator();

		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}//end of class

class DobComparator implements Comparator<Person>
{

	@Override
	public int compare(Person arg0, Person arg1) {

		return arg0.getDate().compareTo(arg1.getDate());
	}


}//end of class
