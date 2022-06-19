package study.assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapQ5 extends Student{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		/*hm.put(12, "Suyog");
		hm.put(75, "Prabhu");
		hm.put(106, "Abhi");*/
		
		
		Set<Integer> set = hm.keySet();
		
		Iterator<Integer> itr = set.iterator();

		
		int cnt = 0;
		while(cnt!=5)
		{
			System.out.println("Enter rollno, name");
			int rollNo = sc.nextInt();
			String name = sc.next();
			
			cnt++;
			hm.put(rollNo, name);
		}
		
		System.out.println(hm);
		
	}

}
