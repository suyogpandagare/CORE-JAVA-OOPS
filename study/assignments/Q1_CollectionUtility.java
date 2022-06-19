package study.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import study.hasa.MyDate;
import study.isa.Employee;

public class Q1_CollectionUtility {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(12, 10000, "PWD", "Suyog", new MyDate(1, 1, 2022)));
		list.add(new Employee(15, 20000, "SDE", "Shreyash", new MyDate(2, 12, 2021)));
		list.add(new Employee(18, 30000, "TESTER", "Abhilash", new MyDate(13, 11, 2000)));
		
		Collections.sort(list);
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id to search");
		int eid = sc.nextInt();
		
		int index = Collections.binarySearch(list, new Employee(eid, 0, null, null, null));
		System.out.println("index at which this object is present is = "+index);
		
			System.out.println(list.get(index));
		
	}

}
