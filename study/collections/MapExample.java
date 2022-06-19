package study.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		//bucket order of hashing
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//natural printing order
		//TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		
		//preserves insertion order
		//LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
		hm.put(12, "Suyog");
		hm.put(1, "sumidha");
		hm.put(10, "pranav");
		hm.put(12, "jaya");   //at 12 position jaya override Suyog the latest one added at same index will present
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter a roll number");
		System.out.println("The name is: "+hm.get(sc.nextInt()));*/
		
		//we cannot use for loop or iterator as there is no indexed access
		
		Set<Integer> set = hm.keySet();//keySet me only unique values aate so unique rollNo aaiynegge
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext())
		{
			int key = iter.next();
			String value = hm.get(key);  //this is to get name also using key
			System.out.println(key+" "+value);  //only roll is printing iter.next()
		} 
	}
}
